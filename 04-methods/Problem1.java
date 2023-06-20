package org.example;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("The largest number is " + maxNumber(num1, num2, num3));
        System.out.println("The smallest number is " + minNumber(num1, num2, num3));
    }

    public static int maxNumber(int num1, int num2, int num3) {
        int largest = Math.max(num1, num2);
        largest = Math.max(largest, num3);
        return largest;
    }
    public static int minNumber(int num1, int num2, int num3) {
        int smallest = Math.min(num1, num2);
        smallest = Math.min(smallest, num3);
        return smallest;
    }
}
