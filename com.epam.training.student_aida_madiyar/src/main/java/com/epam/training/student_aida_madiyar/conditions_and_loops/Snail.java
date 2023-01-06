package com.epam.training.student_aida_madiyar.conditions_and_loops;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int day = 1;
        int high = a;
        if (a >= h) {
            System.out.println(day);
        } else if ((a - b) <= 0 && (a - b) * 2 < h) {
            System.out.println("Impossible");
        } else {
            while (high < h) {
                high += (a - b);
                day++;
            }
            System.out.println(day);
        }
    }
}
