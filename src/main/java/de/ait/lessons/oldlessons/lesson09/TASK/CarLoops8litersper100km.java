package de.ait.lessons.oldlessons.lesson09.TASK;

import java.util.Scanner;

public class CarLoops8litersper100km {
    /*
    Напишите программу, которая рассчитывает, сколько топлива потребуется
    для поездки на расстояние D километров, если расход топлива
    составляет 8 литров на 100 км.
    Пользователь вводит правильное расстояние поездки.
    */

    static int distance;
    static double fuelFuel;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your range in km: ");
            distance = scanner.nextInt();
            if (distance > 0) {
                fuelFuel = (distance * 8) / 100;
                System.out.println("Need fuel : " + fuelFuel + " liters");
                break;
            } else {
                System.out.println("Not correct value " + distance);
            }
        }
        while (true);
        scanner.close();
    }
}