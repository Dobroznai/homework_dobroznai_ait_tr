package ait.de.lessons.oldlessons.lesson13;

/*
Подсчет очков в баскетболе:
Напишите программу, которая запрашивает у пользователя количество игр
 и количество очков, набранных в каждой игре.
 Программа должна вывести общее количество очков и среднее количество очков за игру.
 */

import java.util.Scanner;

public class GamePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game number: ");
        int gameNumber = scanner.nextInt();

        int[] point = new int[gameNumber];
        double totalPoint = 0;

        for (int i = 0; i < gameNumber; i++) {
            System.out.println("Enter your time for race " + (i + 1) + ":");
            point[i] = scanner.nextInt();
            totalPoint += point[i];
        }

        System.out.println("Summary point: " + totalPoint +"\n" + "Average points: " + totalPoint / point.length);
        scanner.close();
    }
}