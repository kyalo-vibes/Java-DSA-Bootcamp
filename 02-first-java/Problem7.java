package com.kyalo;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int fib1 = 0;
        int fib2 = 1;
        int fib3, i;

        System.out.print(fib1 + ", " + fib2);
        for(i=2;i<num;i++){
            fib3 = fib1 + fib2;
            System.out.print(", " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
