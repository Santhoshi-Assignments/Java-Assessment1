package org.example.question2;

import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        scanner.close();

        try {
            double result = divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (InvalidDivisorException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int dividend, int divisor) throws InvalidDivisorException {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
            double result = (double) dividend / divisor;
            System.out.println("Divisor used: " + divisor);
            System.out.println("Dividend used: " + dividend);
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Error occurred: " + e.getMessage());
            throw new InvalidDivisorException("Please pass a valid divisor");
        }
    }
}