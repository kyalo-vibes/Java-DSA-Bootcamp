package org.example;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("The number is " + checkNumber(num));
    }

    public static String checkNumber(int num) {
        if(num % 2 == 0){
            return "even";
        } else {
            return "odd";
        }
    }
}
