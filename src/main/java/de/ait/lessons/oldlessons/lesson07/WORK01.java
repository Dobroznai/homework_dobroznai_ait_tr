package de.ait.lessons.oldlessons.lesson07;

import java.util.Scanner;

public class WORK01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Month of year (1-12):");
        int month = scanner.nextInt();

        String result = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";

            default -> "Invalid month of year";
        };
        System.out.println(result);
        scanner.close();

    }
}
