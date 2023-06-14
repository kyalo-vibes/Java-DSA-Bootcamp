package com.kyalo;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the depreciation rate as a percentage: ");
        int dep = in.nextInt();
        System.out.print("Enter the number of years: ");
        int years = in.nextInt();
        System.out.print("Enter the original amount: ");
        float amount = in.nextInt();
        float temp;
        for (int i = 0; i < years; i++) {
            amount *= (float) (100-dep) / 100;
        }
        System.out.println("The depreciated value is "+amount);
    }
}
