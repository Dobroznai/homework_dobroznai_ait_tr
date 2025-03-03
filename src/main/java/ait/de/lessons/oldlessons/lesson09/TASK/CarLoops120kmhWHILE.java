package ait.de.lessons.oldlessons.lesson09.TASK;

import java.util.Scanner;

public class CarLoops120kmhWHILE {

// Напишите программу, которая запрашивает у пользователя начальную скорость
// автомобиля и выводит скорость после каждой секунды, пока скорость
// не достигнет максимального значения 120 км/ч. Используйте цикл while.

    static int maxSpeed = 120;
    static int speed;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed: ");
        speed = scanner.nextInt();

        while (speed <= maxSpeed) {
            System.out.println("Spe ed is " + speed + " km/h");
            speed++;
        }
        System.out.println("The maximum speed is " + maxSpeed + " km/h");
        scanner.close();
    }
}
