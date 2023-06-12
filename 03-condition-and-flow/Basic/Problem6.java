package com.kyalo;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first diagonal of the rhombus: ");
        float first_diagonal = in.nextFloat();
        System.out.print("Enter the second diagonal of the rectangle: ");
        float second_diagonal = in.nextFloat();
        System.out.println("The area of the rectangle is " + (first_diagonal * second_diagonal / 2));
    }
}
