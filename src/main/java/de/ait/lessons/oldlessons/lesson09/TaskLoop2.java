package de.ait.lessons.oldlessons.lesson09;

import java.util.Scanner;

public class TaskLoop2 {

    static int fuelLevel;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the fuel level in the tank (liters) : ");
            fuelLevel = scanner.nextInt();

            if (fuelLevel < 10) {
                System.out.println("Fuel level is less than 10");
            } else {
                System.out.println("Fuel level is greater than 10");
                break;
            }
        }
        while (true);
        System.out.println("fuel level is normal");
        scanner.close();
    }
}