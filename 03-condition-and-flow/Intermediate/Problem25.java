package com.kyalo;

public class Problem25 {
    public static void main(String[] args) {
        int days = 31;
        int count = 0;
        for (int i = 1; i <= days; i++) {
            if (i % 2 == 0){
                count += 1;
            }
        }
        System.out.println("Kunal can go out with his friends for "+count+" days");
    }
}
