package com.kyalo;

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int product=1, sum=0;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        System.out.println("The difference is " + (product-sum));
    }
}
