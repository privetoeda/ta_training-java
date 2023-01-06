package com.epam.training.student_aida_madiyar.conditions_and_loops;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int personAmount = scanner.nextInt();
        int summ;
        if (bill >= 0 && personAmount > 0) {
            summ = (int) ((bill + (bill * 0.1)) / personAmount);
            System.out.println(summ);
        } else if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else {
            System.out.println("Number of friends cannot be negative or zero");
        }
    }
}
