package com.kyalo;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        if (num1 > num2){
            System.out.println("The greater number is " + num1);
        } else {
            System.out.println("The greater number is " + num2);
        }
    }
}
