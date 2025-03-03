package de.ait.lessons.oldlessons.lesson09.TASK;

import java.util.Scanner;

public class CarLoops10Liters {
    // Напишите программу, которая запрашивает
    //у пользователя текущее количество топлива в баке и
    // предупреждает, если топлива осталось меньше 10 литров.
    //Программа завершает работу, если топлива достаточно.

    static int fuel;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your fuel: ");
            fuel = scanner.nextInt();

            if (fuel < 10) {
                System.out.println("You are low on fuel");
            } else {
                System.out.println("Your fuel is normal");
                break;
            }
        }
        while (true);
        scanner.close();
    }
}