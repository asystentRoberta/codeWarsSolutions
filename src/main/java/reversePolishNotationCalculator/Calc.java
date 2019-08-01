package reversePolishNotationCalculator;

import java.util.ArrayDeque;

public class Calc {

    public double evaluate(String expr) {

        String[] arrayOfStringExpr = expr.split(" ");
        ArrayDeque<Double> stackOfNumbersFromExpression = new ArrayDeque<>();

        for (String fragmentOfEquation : arrayOfStringExpr) {
            makeCalculation(stackOfNumbersFromExpression, fragmentOfEquation);
        }

        return stackOfNumbersFromExpression.pop();
    }

    private void makeCalculation(ArrayDeque<Double> stackOfNumbersFromExpression, String fragmentOfEquation) {

        double firstNumberOfEquation;
        double secondNumberOfEquation;

        switch (fragmentOfEquation) {

            case "":
                stackOfNumbersFromExpression.push((double) 0);
                break;
            case "+":
                stackOfNumbersFromExpression
                        .push(stackOfNumbersFromExpression.pop() + stackOfNumbersFromExpression.pop());
                break;
            case "-":
                firstNumberOfEquation = stackOfNumbersFromExpression.pop();
                secondNumberOfEquation = stackOfNumbersFromExpression.pop();
                stackOfNumbersFromExpression.push(secondNumberOfEquation - firstNumberOfEquation);
                break;
            case "*":
                stackOfNumbersFromExpression
                        .push(stackOfNumbersFromExpression.pop() * stackOfNumbersFromExpression.pop());
                break;
            case "/":
                firstNumberOfEquation = stackOfNumbersFromExpression.pop();
                secondNumberOfEquation = stackOfNumbersFromExpression.pop();
                stackOfNumbersFromExpression.push(secondNumberOfEquation / firstNumberOfEquation);
                break;
            default:
                stackOfNumbersFromExpression.push(Double.valueOf(fragmentOfEquation));
        }
    }
}

