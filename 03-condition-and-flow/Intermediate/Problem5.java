package com.kyalo;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the coordinates of the first point(x1,y1): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Enter the coordinates of the first point(x2,y2): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        float distance = (float) Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("The distance between the two points is "+distance);
    }
}
