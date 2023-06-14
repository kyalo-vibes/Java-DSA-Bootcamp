package com.kyalo;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        // take input till user inputs 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = sc.nextDouble();
        double sum=0;
        int num=0;
        while(marks>0)
        {
            sum+=marks;
            num++;
            marks = sc.nextDouble();
        }
        double average = sum/num;
        System.out.println("Average: "+average);
    }
}
