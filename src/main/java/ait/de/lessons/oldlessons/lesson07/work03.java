package ait.de.lessons.oldlessons.lesson07;
import java.util.Scanner;
public class work03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one: ");
        double numberOne = scanner.nextDouble();

        System.out.println("Enter number two: ");
        double numberTwo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter operator: ");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = numberOne - numberTwo;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = numberOne * numberTwo;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero not possible");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        scanner.close();
    }
}




