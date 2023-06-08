package com.kyalo;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int t1,t2,t,n1,n2,hcf,lcm;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        t1 = n1;
        t2 = n2;
        while (t2 != 0){
            t = t2;
            t2 = t1 % t2;
            t1 = t;
        }
        hcf = t1;
        lcm = (n1 * n2)/hcf;
        System.out.println("HCF: "+hcf+" LCM: "+lcm);
    }
}
