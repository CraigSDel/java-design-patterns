package solid.structural;

import java.util.Scanner;

/*
    This class has 3 distinct operations and three distinct behaviours therefore
    the class violates the single responsibility principle
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to the Application");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String firstNumber = scanner.nextLine();
        System.out.println("Enter the second number:");
        String secondNumber = scanner.nextLine();
        scanner.close();

        int firstInteger = 0;
        int secondInteger = 0;

        try {
            firstInteger = Integer.parseInt(firstNumber);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect Number");
        }

        try {
            secondInteger = Integer.parseInt(secondNumber);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect Number");
        }

        int result = firstInteger * secondInteger;

        System.out.println("The result is: " + result);
    }
}
