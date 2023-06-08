package com.kyalo;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input: ");
        while(in.hasNext()){
            if(in.hasNextInt()){
                sum += in.nextInt();
                System.out.print("Enter input: ");
            } else if (in.next().equalsIgnoreCase("x")) {
                break;
            }
        }
        System.out.println("Sum of the inputs is " + sum);
    }
}
