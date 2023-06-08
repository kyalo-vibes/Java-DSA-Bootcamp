package com.kyalo;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the operator: ");
        char operator = in.next().charAt(0);
        
        if (operator == '+'){
            int sum = num1 + num2;
            System.out.println("Sum of the two numbers is " + sum);
        } else if (operator == '-') {
            int diff = num1 - num2;
            System.out.println("Difference of the two numbers is " + diff);
        } else if (operator == '*') {
            int product = num1 * num2;
            System.out.println("Product of the two numbers is " + product);
        } else if (operator == '/') {
            int division = num1 / num2;
            System.out.println("Division of the two numbers is " + division);
        }

    }
}
