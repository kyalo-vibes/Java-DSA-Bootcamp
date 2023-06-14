package com.kyalo;

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int hcf = 0;
        int limit = Math.max(num1, num2);
        for (int i = 1; i <= limit; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
    }
}
