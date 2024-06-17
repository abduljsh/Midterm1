package arithmetic;

import java.util.Scanner;

public class ArithmeticBase {
    public double x, y;

    double calculate(double x, double y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String s = sc.next();
        Operation operation = Operation.fromString(s);

        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}
