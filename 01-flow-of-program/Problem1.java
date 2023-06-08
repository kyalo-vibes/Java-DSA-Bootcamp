package com.kyalo;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year % 4 == 0){
            System.out.println("Leap year");
        } else {
            System.out.println("Not Leap");
        }
    }
}
