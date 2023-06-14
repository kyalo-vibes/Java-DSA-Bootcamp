package com.kyalo;

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year+" is leap");
        } else{
            System.out.println(year+" is not leap");
        }
    }
}
