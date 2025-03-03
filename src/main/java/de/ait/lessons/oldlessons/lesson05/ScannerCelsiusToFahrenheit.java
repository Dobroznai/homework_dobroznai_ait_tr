package de.ait.lessons.oldlessons.lesson05;

import java.util.Scanner;

public class ScannerCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Градусы Фаренгейта: " + fahrenheit);
        scanner.close();
    }
}