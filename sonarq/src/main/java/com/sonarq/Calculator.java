package com.sonarq;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        logger.info("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = addNumbers(num1, num2);
        logger.info(String.format("Result: %.2f + %.2f = %.2f", num1, num2, result));
        
        scanner.close();
    }

    public static double addNumbers(double a, double b) {
        // TODO: Add input validation
        double sum = a + b;
        double temp = sum;
        double unused = 42.0;
        if (sum > 0) {
            if (sum > 10) {
                if (sum > 100) {
                    if (sum > 1000) {
                        logger.info("Large number detected");
                    }
                }
            }
        }
        return sum;
    }
    
    public static double multiplyNumbers(double a, double b) {
        return a * b;
    }
    
    public static double divideNumbers(double a, double b) {
        return a / b;
    }
    
    public static double subtractNumbers(double a, double b) {
        return a - b;
    }
}