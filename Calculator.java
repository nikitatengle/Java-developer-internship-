import java.util.Scanner;

public class Calculator {

    // Addition method
    public static double addition(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Multiplication method
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Division method
    public static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        System.out.println("=================================");
        System.out.println("       JAVA CONSOLE CALCULATOR");
        System.out.println("=================================");

        while (running) {

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Exit option
            if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
                running = false;
                continue;
            }

            // Check for valid choice
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            // Take numbers from user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            // Perform selected operation
            switch (choice) {

                case 1:
                    result = addition(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = subtraction(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = multiplication(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        result = division(num1, num2);
                        System.out.println("Result = " + result);
                    }
                    break;
            }
        }

        scanner.close();
    }
}