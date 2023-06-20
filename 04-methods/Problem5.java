package org.example;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.println("The product is " + product(num1, num2));
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }
}
