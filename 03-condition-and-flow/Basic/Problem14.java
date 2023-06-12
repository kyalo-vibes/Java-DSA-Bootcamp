package com.kyalo;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the cone: ");
        float radius = in.nextFloat();
        System.out.print("Enter the height of the cone: ");
        float height = in.nextFloat();
        System.out.println("The volume of the cone is " + (Math.PI * Math.pow(radius,2)) * height / 3);
    }
}
