package org.example;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();;
        System.out.println("Can vote: " + checkAge(age));
    }

    public static boolean checkAge (int age) {
        return age >= 18;
    }
}
