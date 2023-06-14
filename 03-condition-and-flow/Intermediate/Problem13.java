package com.kyalo;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        // take input till user inputs 0
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        int sum = 0;
        while(num>0)
        {
            sum+=num;
            System.out.print("Enter a number: ");
            num = sc.nextDouble();
        }
        System.out.println("Sum: "+sum);
    }
}
