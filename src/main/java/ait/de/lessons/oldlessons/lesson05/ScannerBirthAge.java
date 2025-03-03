package ait.de.lessons.oldlessons.lesson05;

import java.util.Scanner;

public class ScannerBirthAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int year = scanner.nextInt();

        int age = 2024 - year; // int age = LocalDate.now().getYear - year

        if (age < 18) {
            System.out.println("You are " + age + " years old. You are a minor");
        } else {
            System.out.println("You are old. You are a minor");
        }
        scanner.close();
    }
}