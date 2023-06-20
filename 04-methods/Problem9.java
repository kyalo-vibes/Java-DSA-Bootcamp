package org.example;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Factorial of "+num+" is "+factorial(num));
    }

    public static int factorial(int num) {
        int answer = 1;
        if (num == 0 || num == 1) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }
}
