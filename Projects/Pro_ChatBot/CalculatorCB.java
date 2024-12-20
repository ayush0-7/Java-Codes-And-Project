

public class CalculatorCB {
    public double calculateExpression(String expression) {
        double result = 0.0;
        String n = "";
        char lastOperator = '+';

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                n += c;
            }

            if (c == '+' || c == '-' || c == '*' || c == '/' || i == expression.length() - 1) {
                if (n.length() > 0) {
                    double currentNumber = Double.parseDouble(n);
                    n = "";

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
                                return Double.NaN;
                            }
                            break;
                    }
                }
                lastOperator = c;
            }
        }
        return result;
    }
}
