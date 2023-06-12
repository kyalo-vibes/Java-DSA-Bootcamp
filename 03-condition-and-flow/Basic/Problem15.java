package com.kyalo;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the prism: ");
        float length = in.nextFloat();
        System.out.print("Enter the width of the prism: ");
        float width = in.nextFloat();
        System.out.print("Enter the height of the prism: ");
        float height = in.nextFloat();
        System.out.println("The volume of the prism is " + (length * width * height));
    }
}
