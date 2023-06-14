package com.kyalo;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.print("Enter the power variable: ");
        int power = in.nextInt();
        float answer = (float) Math.pow(num,power);
        System.out.println(num+" to the power of "+power+" is "+answer);
    }
}
