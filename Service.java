package Homework;

public interface Service {

    /**
     * @param arg1   действительная часть первого числа Integer
     * @param imArg1 мнимая часть первого числа Integer
     * @param arg2   действительная часть второго числа Integer
     * @param imArg2 мнимая часть второго числа Integer
     * @apiNote реализует работу канкулятора, запускается из метода start, взависимости от выбора пользователя
     * может запускать методы sum, div, multi из класса ComplexCalculator, после завершения метода, вызывает метод
     * end
     */
    void run(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2);

    /**
     * @apiNote в зависимости от выбора пользователя предоставляет возможность завершить работу с канкулятором,
     * вызывается из метода run
     */
    void end();

    /**
     * @apiNote реализует запуск канкулятора, запрашивает у пользователя данные для расчета, после запускает
     * метод run
     */
    void start();
}