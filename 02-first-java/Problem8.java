package com.kyalo;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();

        String rev = "";
        int len = word.length();
        for(int i = len-1; i>=0;i--){
            rev = rev + word.charAt(i);
        }
        if (word.equals(rev)){
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
