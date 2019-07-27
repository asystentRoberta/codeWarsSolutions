package reversePolishNotationCalculator;

import java.util.ArrayDeque;

public class Calc {

    public double evaluate(String expr) {

        if (expr.equals("")) {
            return 0;
        }

        String[] arrayOfStringExpr = expr.split(" ");

        ArrayDeque<Double> stackOfNumbersFromExpression = new ArrayDeque<>();

        for (String s : arrayOfStringExpr) {
            if (s.matches("\\d*\\.\\d+") || s.matches("\\d+")) {
                stackOfNumbersFromExpression.push(Double.valueOf(s));
            } else {
                makeCalculation(stackOfNumbersFromExpression, s);
            }
        }
        return stackOfNumbersFromExpression.pop();
    }

    private void makeCalculation(ArrayDeque<Double> stackOfNumbersFromExpression, String equationSing) {

        double firstNumberOfCalculation = stackOfNumbersFromExpression.pop();
        double secondNumberOfCalulation = stackOfNumbersFromExpression.pop();

        switch (equationSing) {
            case "+":
                stackOfNumbersFromExpression.push(secondNumberOfCalulation + firstNumberOfCalculation);
                break;
            case "-":
                stackOfNumbersFromExpression.push(secondNumberOfCalulation - firstNumberOfCalculation);
                break;
            case "*":
                stackOfNumbersFromExpression.push(secondNumberOfCalulation * firstNumberOfCalculation);
                break;
            case "/":
                stackOfNumbersFromExpression.push(secondNumberOfCalulation / firstNumberOfCalculation);
                break;
            default:
                System.out.println("Error");
        }
    }
}
