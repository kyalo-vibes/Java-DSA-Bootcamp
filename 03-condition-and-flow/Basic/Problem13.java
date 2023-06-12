package com.kyalo;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the rhombus: ");
        float side = in.nextFloat();
        System.out.println("The perimeter of the rhombus is " + side * 4);
    }
}
