package com.kyalo;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the equal sides of the triangle: ");
        float sameLength = in.nextFloat();
        System.out.print("Enter the base of the triangle: ");
        float base = in.nextFloat();
        float height = (float) (Math.sqrt(Math.pow(sameLength,2) - Math.pow(base / 2, 2)));
        System.out.println("The area of the triangle is " + (0.5 * base * height));
    }
}
