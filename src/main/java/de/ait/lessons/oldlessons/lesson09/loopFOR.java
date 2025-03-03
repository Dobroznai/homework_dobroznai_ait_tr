package de.ait.lessons.oldlessons.lesson09;

import java.util.Scanner;

public class loopFOR {
    public static void main(String[] args) {
        // i++

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

    }
}
