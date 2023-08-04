package Homework;

public interface ComplexOperation {

    /**
     * @param arg1   действительная часть первого числа Integer
     * @param imArg1 мнимая часть первого числа Integer
     * @param arg2   действительная часть второго числа Integer
     * @param imArg2 мнимая часть второго числа Integer
     * @apiNote реализует сложение двух комплексных чисел с типом Integer, для отображения данных вызывает метод
     * showResult из класса View
     */
    void sum(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2);

    /**
     * @param arg1   действительная часть первого числа Integer
     * @param imArg1 мнимая часть первого числа Integer
     * @param arg2   действительная часть второго числа Integer
     * @param imArg2 мнимая часть второго числа Integer
     * @apiNote реализует деление двух комплексных чисел с типом Integer, для отображения данных вызывает метод
     * showResult из класса View
     */
    void div(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2);

    /**
     * @param arg1   действительная часть первого числа Integer
     * @param imArg1 мнимая часть первого числа Integer
     * @param arg2   действительная часть второго числа Integer
     * @param imArg2 мнимая часть второго числа Integer
     * @apiNote реализует умножение двух комплексных чисел с типом Integer, для отображения данных вызывает метод
     * showResult из класса View
     */
    void multi(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2);
}