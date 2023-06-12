package com.kyalo;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float length = in.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float width = in.nextFloat();
        System.out.println("The perimeter of the rectangle is " + (length + width) * 2);
    }
}
