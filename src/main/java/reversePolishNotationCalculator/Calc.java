package reversePolishNotationCalculator;

import java.util.ArrayDeque;

public class Calc {

    public double evaluate(String expr) {

        if (expr.equals("")) {
            return 0;
        }
        if (expr.matches("\\d*\\.\\d+") || expr.matches("\\d*")) {
            return Double.parseDouble(expr);
        }

        String[] arrayOfStringExpr = expr.split(" ");

        ArrayDeque<Double> stackOfNumbersFromExpression = new ArrayDeque<>();

        for (String s : arrayOfStringExpr) {
            if (s.matches("\\d*\\.\\d+") || s.matches("\\d+")) {
                stackOfNumbersFromExpression.push(Double.valueOf(s));
            } else {
                switch (s) {
                    case "+":
                        stackOfNumbersFromExpression.push(
                                stackOfNumbersFromExpression.pop() + stackOfNumbersFromExpression.pop()
                        );

                        break;
                    case "-":
                        double firstOfSubstractionNumbers = stackOfNumbersFromExpression.pop();
                        double secondOfSubstractionNumbers = stackOfNumbersFromExpression.pop();
                        stackOfNumbersFromExpression.push(
                                secondOfSubstractionNumbers - firstOfSubstractionNumbers);

                        break;
                    case "*":
                        stackOfNumbersFromExpression.push(
                                stackOfNumbersFromExpression.pop() * stackOfNumbersFromExpression.pop()
                        );
                        break;
                    case "/":
                        double divisor = stackOfNumbersFromExpression.pop();
                        double divided = stackOfNumbersFromExpression.pop();
                        stackOfNumbersFromExpression.push(divided / divisor);
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }
        return stackOfNumbersFromExpression.pop();
    }
}
