package com.kyalo;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        float base = in.nextFloat();
        System.out.print("Enter the side of the parallelogram: ");
        float side = in.nextFloat();
        System.out.println("The perimeter of the parallelogram is " + (base + side) * 2);
    }
}
