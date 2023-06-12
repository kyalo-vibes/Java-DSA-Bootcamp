package com.kyalo;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the equilateral triangle: ");
        float length = in.nextFloat();
        System.out.println("The area of the equilateral triangle is " + (Math.sqrt(3)/4 * Math.pow(length,2)));
    }
}
