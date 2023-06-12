package com.kyalo;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        float length = in.nextFloat();
        System.out.println("The perimeter of the rectangle is " + (length * 4));
    }
}
