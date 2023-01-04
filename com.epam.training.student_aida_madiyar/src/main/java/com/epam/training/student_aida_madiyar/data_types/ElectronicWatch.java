package com.epam.training.student_aida_madiyar.data_types;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = seconds /60/60%24;
        int minutes = seconds /60%60;
        int seconds1 = seconds %60;
        System.out.println(hours + ":" + str(minutes) + ":" + str(seconds1));
    }
    private static String str(int seconds){
        return seconds < 10 ? "0" + seconds : "" + seconds;
    }

}
