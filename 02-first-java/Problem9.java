package com.kyalo;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        int n1,n2,sum = 0;

        for(int i = num1;i<=num2;i++){
            n1 = i;
            while (n1>0){
                n2 = n1 % 10;
                sum += (n2 * n2 * n2);
                n1 = n1/10;
            }
            if (sum == i){
                System.out.print(i + " ");
            }
            sum = 0;
        }

    }
}
