package com.kyalo;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i <= num; i++) {
            int temp = b;
            b += a;
            a = temp;
            System.out.print(" " + b);
        }
        System.out.println();
        System.out.println("The number in the fibonacci series is: " + b);
    }
}
