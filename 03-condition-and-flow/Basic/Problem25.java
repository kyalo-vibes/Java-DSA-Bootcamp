package com.kyalo;

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int largest = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if (num == 0){
                break;
            }
            else {
                if (num > largest) {
                    largest = num;
                }
            }
        }
        System.out.println(largest);
    }
}
