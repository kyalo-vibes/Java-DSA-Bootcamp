package com.kyalo;

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if (num != 0) {
                sum += num;
            } else {
                break;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
