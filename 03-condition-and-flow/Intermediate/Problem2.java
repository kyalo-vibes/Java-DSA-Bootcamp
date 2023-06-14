package com.kyalo;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of kwh used: ");
        float kwh = in.nextFloat();
        System.out.print("Enter the electricity rate of kwh(ksh/kwh): ");
        float rate = in.nextFloat();
        System.out.print("Enter the electricity rate of kwh: ");
        if(kwh > 0 && rate > 0) {
            float bill = kwh * rate;
            System.out.println("The bill is ksh."+ bill);
        } else {
            System.out.println("Invalid input");
        }
    }
}
