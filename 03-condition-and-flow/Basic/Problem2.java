package com.kyalo;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        float base = in.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height = in.nextFloat();
        System.out.println("The area of the triangle is " + (0.5 * base * height));
    }
}
