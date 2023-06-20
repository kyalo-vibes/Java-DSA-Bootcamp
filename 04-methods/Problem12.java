package org.example;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();
        System.out.println("Pythagorean triplet: " + isPythagoreanTriplet(num1, num2, num3));
    }

    public static boolean isPythagoreanTriplet(int num1, int num2, int num3) {
        return Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2);
    }
}
