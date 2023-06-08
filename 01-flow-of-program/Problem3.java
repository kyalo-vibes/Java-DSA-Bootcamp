package com.kyalo;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();;
        int i = 1;
        while (i < 11){
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
            i++;
        }
    }
}
