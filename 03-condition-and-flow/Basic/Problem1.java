package com.kyalo;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = in.nextFloat();
        System.out.println("The area of the circle is " + (3.142 * radius * radius));
    }
}
