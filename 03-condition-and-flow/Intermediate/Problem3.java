package com.kyalo;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            sum += num;
        }
        float average = sum/n;
        System.out.println("The average is "+average);
    }
}
