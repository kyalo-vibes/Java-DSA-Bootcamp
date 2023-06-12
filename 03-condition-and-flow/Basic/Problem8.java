package com.kyalo;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle: ");
        float diameter = in.nextFloat();
        System.out.println("The perimeter of the circle is " + (3.142 * diameter));
    }
}
