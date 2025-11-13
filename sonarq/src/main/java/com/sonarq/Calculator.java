package com.sonarq;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        logger.info("Simple Calculator - Addition");
        logger.info("============================");
        
        logger.info("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        logger.info("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        
        logger.info(String.format("Result: %.2f + %.2f = %.2f", num1, num2, sum));
        
        scanner.close();
    }
}