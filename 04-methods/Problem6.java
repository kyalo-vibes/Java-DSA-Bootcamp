package org.example;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = in.nextInt();
        System.out.println("The circumference is " + circumference(radius));
        System.out.println("The area is " + area(radius));
    }

    public static float circumference (float radius) {
        return (float) (2 * Math.PI * radius);
    }

    public static float area (float radius) {
        return (float) (Math.PI * radius * radius);
    }
}
