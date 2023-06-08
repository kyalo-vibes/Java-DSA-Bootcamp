package com.kyalo;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any amount(KES): ");
        int kshCurr = in.nextInt();
        float usdCUrr = (float) (kshCurr / 139.20);
        System.out.println("The amount in USD is " + usdCUrr);
    }
}
