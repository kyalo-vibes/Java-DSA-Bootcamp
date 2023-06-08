package com.kyalo;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int principal = in.nextInt();
        System.out.print("Enter the time of the loan in years: ");
        int year = in.nextInt();
        System.out.print("Enter the percentage rate of the loan: ");
        float rate = in.nextFloat();
        float simpleInt = (principal * rate * year) / 100;
        System.out.println("The simple interest of the loan is: " + simpleInt);
    }
}
