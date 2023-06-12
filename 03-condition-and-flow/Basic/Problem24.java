package com.kyalo;

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if (num == 0){
                break;
            }
            else {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
