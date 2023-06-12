package com.kyalo;

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the cube: ");
        float length = in.nextFloat();
        System.out.println("The surface area of the cube is " + (length * length) * 6);
    }
}
