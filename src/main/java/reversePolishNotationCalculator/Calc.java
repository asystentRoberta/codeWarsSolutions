package reversePolishNotationCalculator;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public double evaluate(String expr) {

        if (expr.equals("")) {
            return 0;
        }
        if(expr.matches("\\d*\\.\\d+") || expr.matches("\\d*")){
            return Double.parseDouble(expr);
        }

        String[] arrayOfStringExpr = expr.split(" ");
        List<Double> stackOfNumbers = new ArrayList<>();
        int pointerOfTheStack = 0;
        double resultOfExpresion = 0.0;

        for (String s : arrayOfStringExpr) {
            if (s.matches("\\d*\\.\\d+") || s.matches("\\d+")) {
                stackOfNumbers.add(Double.valueOf(s));
                pointerOfTheStack++;
            } else {
                switch (s) {
                    case "+":
                        resultOfExpresion =
                                stackOfNumbers.get(pointerOfTheStack -2) + stackOfNumbers.get(pointerOfTheStack - 1);
                        break;
                    case "-":
                        resultOfExpresion =
                                stackOfNumbers.get(pointerOfTheStack -2) - stackOfNumbers.get(pointerOfTheStack - 1);
                        break;
                    case "*":
                        resultOfExpresion =
                                stackOfNumbers.get(pointerOfTheStack-2) * stackOfNumbers.get(pointerOfTheStack - 1);
                        break;
                    case "/":
                        resultOfExpresion =
                                stackOfNumbers.get(pointerOfTheStack-2) / stackOfNumbers.get(pointerOfTheStack - 1);
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }
        return resultOfExpresion;
    }
}
