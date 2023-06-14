package com.kyalo;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        int price = in.nextInt();
        System.out.println("Enter the percentage discount: ");
        int discountPercentage = in.nextInt();
        float discount = price * discountPercentage / 100;
        System.out.println("The discount is "+discount);
    }
}
