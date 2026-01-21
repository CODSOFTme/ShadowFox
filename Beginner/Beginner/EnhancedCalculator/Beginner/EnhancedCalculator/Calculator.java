import java.util.Scanner;

public class Calculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Enhanced Console-based Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Celsius to Fahrenheit");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    squareRoot();
                    break;
                case 6:
                    power();
                    break;
                case 7:
                    temperatureConversion();
                    break;
                case 8:
                    System.out.println("Calculator Closed. Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);
    }

    static void addition() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + (a + b));
    }

    static void subtraction() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + (a - b));
    }

    static void multiplication() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + (a * b));
    }

    static void division() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
        } else {
            System.out.println("Result = " + (a / b));
        }
    }

    static void squareRoot() {
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        System.out.println("Square Root = " + Math.sqrt(a));
    }

    static void power() {
        System.out.print("Enter base and exponent: ");
        double base = sc.nextDouble();
        double exp = sc.nextDouble();
        System.out.println("Result = " + Math.pow(base, exp));
    }

    static void temperatureConversion() {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
