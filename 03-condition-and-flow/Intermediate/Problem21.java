package com.kyalo;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char original = in.next().trim().charAt(0);
        char input = Character.toLowerCase(original);
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println(original+" is a vowel");
        } else {
            System.out.println(original+" is a consonant");
        }

    }
}
