package com.kyalo;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int factorial = 1;
        for (int i = num; i > 0;i--) {
            factorial *= i;
        }
        System.out.println("The factorial of "+num+" is "+ factorial);
    }
}
