package com.kyalo;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        float radius = in.nextFloat();
        System.out.println("The volume of the sphere is " + (4/3 * Math.PI * Math.pow(radius,3)));
    }
}
