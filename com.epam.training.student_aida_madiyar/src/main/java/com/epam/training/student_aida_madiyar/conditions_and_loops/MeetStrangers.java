package com.epam.training.student_aida_madiyar.conditions_and_loops;

import java.io.IOException;
import java.util.Scanner;

public class MeetStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 0) {
            Scanner names = new Scanner(System.in);
            for (int i = 0; i < input; i++) {
                String myA = names.nextLine();
                System.out.println("Hello, " + myA);
            }
        }
        else if(input==0){
            System.out.println("Oh, it looks like there is no one here");
        }
        else{
            System.out.println("Seriously? Why so negative?");
        }
    }
}
