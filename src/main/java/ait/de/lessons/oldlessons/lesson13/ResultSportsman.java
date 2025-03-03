package ait.de.lessons.oldlessons.lesson13;

/*
Ввод результатов спортсмена:
Напишите программу, которая запрашивает у пользователя
количество забегов и время каждого забега,
затем сохраняет результаты в массиве и выводит среднее время.
 */

import java.util.Scanner;

public class ResultSportsman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Race number: ");
        int raceNumber = scanner.nextInt();

        double[] times = new double[raceNumber];
        double sum = 0;

        for (int i = 0; i < raceNumber; i++) {
            System.out.println("Enter your time for race " + (i + 1) + ":");
            times[i] = scanner.nextDouble();
            sum = sum + times[i];
        }
        System.out.println("Average time: " + sum / times.length);
        scanner.close();
    }
}