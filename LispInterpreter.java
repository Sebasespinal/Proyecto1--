package uvg.edu.gt;
import java.util.Stack;

public class LispInterpreter {
    public static double evaluate(String expression) {
        String[] tokens = expression.split("\\s+");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double subtrahend = stack.pop();
                    stack.push(stack.pop() - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String expression = "( + 10 5 )"; // Expresión Lisp: (+ 10 5)
        double result = evaluate(expression);
        System.out.println("Resultado: " + result); // Debería imprimir 15.0
    }
}
