package com.kyalo;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total sales of the agent: ");
        int sales = in.nextInt();
        System.out.print("Enter the percentage commission: ");
        int commPercentage = in.nextInt();;
        int commission = sales * commPercentage;
        System.out.println("The commission of the agent is "+commission);
    }
}
