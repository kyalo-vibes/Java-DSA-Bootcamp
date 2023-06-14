package com.kyalo;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next().trim();
        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
