package Homework;

import java.util.logging.Level;
import java.util.logging.Logger;

public class View {

    public View() {

    }

    /**
     * @param arg1 действительная часть числа типа Double
     * @param arg2 мнимая часть числа типа Double
     * @apiNote выводит результаты расчета в консоль, запускается из метода run класса UserService
     */
    public void showResult(Double arg1, Double arg2) {
        Logger logger = Logger.getLogger(UserService.class.getName());
        if ((arg2 > 0) && (arg1 != 0)) {
            System.out.println("Результат: " + arg1 + "+" + arg2 + "i");
            logger.log(Level.INFO, "Результат операции: " + arg1 + "+" + arg2 + "i");
        } else if ((arg2 == 0) && (arg1 != 0)) {
            System.out.println("Результат: " + arg1);
            logger.log(Level.INFO, "Результат операции: " + arg1);
        } else if ((arg1 == 0) && (arg2 != 0)) {
            System.out.println("Результат: " + arg2 + "i");
            logger.log(Level.INFO, "Результат операции: " + arg2 + "i");
        } else if ((arg1 == 0) && arg2 == 0) {
            System.out.println("Результат: 0");
            logger.log(Level.INFO, "Результат операции: 0");
        } else {
            System.out.println("Результат: " + arg1 + "" + arg2 + "i");
            logger.log(Level.INFO, "Результат операции: " + arg1 + "" + arg2 + "i");
        }
    }
}
