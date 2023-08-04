package Homework;

public class ComplexCalculator extends Calculator implements ComplexOperation {

    Integer imArg1;
    Integer imArg2;

    public ComplexCalculator(Integer argument1, Integer argument2) {
        super(argument1, argument2);
    }

    public ComplexCalculator() {

    }

    View view = new View();

    @Override
    public void sum(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2) {
        Integer realResult = arg1 + arg2;
        Integer imResult = imArg1 + imArg2;
        view.showResult((double) realResult, (double) imResult);
    }

    @Override
    public void div(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2) {
        if (arg2 * arg2 + imArg2 * imArg2 == 0) {
            Integer realResult = (arg1 * arg2 + imArg1 * imArg2);
            Integer imResult = (imArg1 * arg2 - arg1 * imArg2);
            view.showResult((double) realResult, (double) imResult);
        } else {
            Double realResult = ((arg1 * arg2 + imArg1 * imArg2) / (double) (arg2 * arg2 + imArg2 * imArg2));
            Double imResult = ((imArg1 * arg2 - arg1 * imArg2) / (double) (arg2 * arg2 + imArg2 * imArg2));
            view.showResult(realResult, imResult);
        }
    }

    @Override
    public void multi(Integer arg1, Integer imArg1, Integer arg2, Integer imArg2) {
        Integer realResult = (arg1 * arg2) + (imArg1 * (imArg2 * -1));
        Integer imResult = (imArg1 * arg2) + (arg1 * imArg2);
        view.showResult((double) realResult, (double) imResult);
    }
}

