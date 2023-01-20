package com.epam.training.student_aida_madiyar.conditions_and_loops;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;
        num = scanner.nextInt();
        while (num != 0){
            if (num > max) {
                max = num;
            }
            num = scanner.nextInt();
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Test your code here! \n");
        FindMaxInSeq test = new FindMaxInSeq();
        System.out.println(max());
    }
}
