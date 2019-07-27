package reversePolishNotationCalculator;

import java.util.Stack;

public class CalcWithStackSoSimple {

    public double evaluate(String expr) {

        if (expr.equals("")) {
            return 0;
        }

        Stack<Double> stack = new Stack<>();
        String[] atoms = expr.split(" ");

        for (String atom : atoms) {
            Double a,b;
            switch (atom){
                case "+": stack.push(stack.pop()+stack.pop()); break;
                case "-": b=stack.pop(); a=stack.pop(); stack.push(a-b); break;
                case "*": stack.push(stack.pop() * stack.pop()); break;
                case "/": b=stack.pop(); a=stack.pop(); stack.push(a/b); break;
                default:
                    stack.push(Double.parseDouble(atom));
            }
        }
        return stack.pop();
    }
}
