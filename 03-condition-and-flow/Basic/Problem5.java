package com.kyalo;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        float base = in.nextFloat();
        System.out.print("Enter the height of the parallelogram: ");
        float height = in.nextFloat();
        System.out.println("The area of the parallelogram is " + (base * height));
    }
}
