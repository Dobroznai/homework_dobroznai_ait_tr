package ait.de.lessons.oldlessons.lesson13;

/*
Подсчет количества желтых и красных карточек:
Напишите программу, которая запрашивает у пользователя количество матчей и
количество желтых и красных карточек, полученных командой в каждом матче.
Программа должна вывести общее количество желтых и красных карточек.

Пример ввода:

Введите количество матчей: 2
Введите количество желтых карточек в матче 1: 3
Введите количество красных карточек в матче 1: 1
Введите количество желтых карточек в матче 2: 2
Введите количество красных карточек в матче 2: 0

Пример вывода:

Общее количество желтых карточек: 5
Общее количество красных карточек: 1
 */

import java.util.Scanner;

public class SummAllCard_notcorrected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game number: ");
        int gameNumber = scanner.nextInt();

        int[] game = new int[gameNumber];
        int amountRedCard = 0;
        int amountYellowCard = 0;

        for (int i = 0; i < gameNumber; i++) {
            System.out.println("Number of red cards --> " + (i + 1) + ":");
            game[i] = scanner.nextInt();
            amountRedCard += game[i];

            System.out.println("Number of yellow cards --> " + (i + 1) + ":");
            game[i] = scanner.nextInt();
            amountYellowCard += game[i];
        }
        scanner.close();
        System.out.println("Number of red cards: " + amountRedCard + "\n" + "Number of yellow cards: " + amountYellowCard);

    }
}
