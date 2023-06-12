package com.kyalo;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the equilateral triangle: ");
        float length = in.nextFloat();
        System.out.println("The perimeter of the equilateral triangle is " + (length * 3));
    }
}
