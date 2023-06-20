package org.example;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks(0-100): ");
        int marks = in.nextInt();
        System.out.println("Your grade is " + computeGrade(marks));
        System.out.println("Your grade using switch case is " + computeGradeUsingSwitch(marks));
    }
    
    public static String computeGrade(int marks) {
        if (marks > 90 && marks <= 100) {
            return "AA";
        } else if (marks > 80 && marks <= 90) {
            return "AB";
        } else if (marks > 70 && marks <= 90) {
            return "BB";
        } else if (marks > 60 && marks <= 70) {
            return "BC";
        } else if (marks > 50 && marks <= 60) {
            return "CD";
        } else if (marks > 40 && marks <= 50) {
            return "DD";
        } else  {
            return "Fail";
        }
    }

    public static String computeGradeUsingSwitch(int marks) {
        switch (marks / 10) {
            case 9 -> { return "AA"; }
            case 8 -> { return "AB"; }
            case 7 -> { return "BB"; }
            case 6 -> { return "BC"; }
            case 5 -> { return "CD"; }
            case 4 -> { return "DD"; }
            default -> { return "Fail"; }
        }
    }
}
