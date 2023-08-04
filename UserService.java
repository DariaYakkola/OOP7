package Homework;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService implements Service {
    Logger logger = Logger.getLogger(UserService.class.getName());
    Scanner sc = new Scanner(System.in);

    @Override
    public void run(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2) {
        ComplexCalculator calculator = new ComplexCalculator();
        System.out.println("Выберете операцию: 1 - сложение, 2 - умножение, 3 - деление");
        Integer operation = sc.nextInt();
        logger.log(Level.INFO, "Вы выбрали оперцию - " + operation);
        if (operation == 1) {
            calculator.sum(arg1, imArg1, arg2, imArg2);
            end();
        } else if (operation == 2) {
            calculator.multi(arg1, imArg1, arg2, imArg2);
            end();
        } else if (operation == 3) {
            calculator.div(arg1, imArg1, arg2, imArg2);
            end();
        } else {
            System.out.println("Такой операции не существует! Попробуйте еще раз!");
            run(arg1, imArg1, arg2, imArg2);
        }
    }

    @Override
    public void end() {
        System.out.println("Хотите продолжить работу с канкулятором? 0 - выйти, 1 - продолжить");
        Integer exit = sc.nextInt();
        if (exit == 0) {
            logger.log(Level.INFO, "Вы решили закончить работу с канкулятором");
            System.exit(0);
        } else if (exit == 1) {
            logger.log(Level.INFO, "Вы продолжили работу с канкулятором");
            start();
        } else {
            System.out.println("Такой команды не существует! Попробуйте еще раз!");
            end();
        }
    }

    @Override
    public void start() {
        System.out.println("Введите действительную часть первого числа: ");
        Integer arg1 = sc.nextInt();
        System.out.println("Введите мнимую часть первого числа: ");
        Integer imArg1 = sc.nextInt();
        if (imArg1 >= 0) {
            logger.log(Level.INFO, "Вы ввели первое число: " + arg1 + "+" + imArg1 + "i");
        } else {
            logger.log(Level.INFO, "Вы ввели первое число: " + arg1 + imArg1 + "i");
        }
        System.out.println("Введите действительную часть второго числа: ");
        Integer arg2 = sc.nextInt();
        System.out.println("Введите мнимую часть второго числа: ");
        Integer imArg2 = sc.nextInt();
        if (imArg2 >= 0) {
            logger.log(Level.INFO, "Вы ввели второе число: " + arg2 + "+" + imArg2 + "i");
        } else {
            logger.log(Level.INFO, "Вы ввели второе число: " + arg2 + imArg2 + "i");
        }
        run(arg1, imArg1, arg2, imArg2);
    }
}
