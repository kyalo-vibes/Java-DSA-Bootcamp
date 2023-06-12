package com.kyalo;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid: ");
        float length = in.nextFloat();
        System.out.print("Enter the width of the pyramid: ");
        float width = in.nextFloat();
        System.out.print("Enter the height of the pyramid: ");
        float height = in.nextFloat();
        System.out.println("The volume of the pyramid is " + (length * width * height)/3);
    }
}
