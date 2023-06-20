package org.example;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("The sum of first "+num+" natural numbers is "+sumNaturalNumbers(num));
    }

    public static int sumNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
