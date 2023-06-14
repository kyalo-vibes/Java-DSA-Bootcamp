package com.kyalo;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num+" is a palindrome");
        } else {
            System.out.println(num+" is not a palindrome");
        }
    }

    public static boolean isPalindrome(int num) {
        int pal=0;
        int temp = num;
        while (temp>0) {
            pal = (pal * 10) + (temp % 10);
            temp /= 10;
        }
        System.out.println(pal == num);
        return pal == num;
    }
}
