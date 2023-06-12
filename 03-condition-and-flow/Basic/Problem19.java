package com.kyalo;

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diameter of the cylinder: ");
        float diameter = in.nextFloat();
        System.out.print("Enter the height of the cylinder: ");
        float height = in.nextFloat();
        System.out.println("The curved surface area of the cylinder is " + (Math.PI * diameter * height));
    }
}
