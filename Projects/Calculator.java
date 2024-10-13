package Projects;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expression for Add, Subtract, Multiply, or Divide (e.g., 3+2-1): ");
        String expression = in.nextLine();
        double result = 0.0;
        String n = "";
        char lastOperator = '+';

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                n += c;
            }

            // Charater or End of the string
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == expression.length() - 1) {
                // Process the last number before the operator
                if (n.length() > 0) {
                    double currentNumber = Double.parseDouble(n);
                    n = "";

                    // Apply the last operator to the result and the current number
                    switch (lastOperator) {
                        case '+':
                            result += currentNumber;
                            break;
                        case '-':
                            result -= currentNumber;
                            break;
                        case '*':
                            result *= currentNumber;
                            break;
                        case '/':
                            if (currentNumber != 0) {
                                result /= currentNumber;
                            } else {
                                System.out.println("Error: Division by zero.");
                                return;
                            }
                            break;
                    }
                }
                lastOperator = c;
            }
        }
        System.out.println("Result: " + result);
    }
}
