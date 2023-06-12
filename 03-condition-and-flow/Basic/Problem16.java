package com.kyalo;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the cylinder: ");
        float radius = in.nextFloat();
        System.out.print("Enter the height of the cylinder: ");
        float height = in.nextFloat();
        System.out.println("The volume of the cylinder is " + (Math.PI * Math.pow(radius,2) * height));
    }
}
