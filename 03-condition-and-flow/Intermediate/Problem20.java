package com.kyalo;

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int lcm = findLCM(num1,num2);
        System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
    }

    public static int findLCM(int num1, int num2) {
        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }

    public static int findHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findHCF(num2, num1 % num2);
        }
    }
}
