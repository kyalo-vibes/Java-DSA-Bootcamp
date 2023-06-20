package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Palindrome: "+isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int check = 0;
        int length = String.valueOf(num).length() - 1;
        while (temp > 0) {
            check += (temp % 10) * Math.pow(10,length);
            temp /= 10;
            length--;
        }
        return check == num;
    }
}
