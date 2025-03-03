package de.ait.consultation;

import java.util.Scanner;

public class loopTask01 {

    /*
    Счетчик наград
    Напишите программу, которая запрашивает у пользователя информацию о том,
    сколько фильмов он посмотрел и сколько из них получили награды.
    Программа должна подсчитать процент награжденных фильмов с использованием
    цикла while.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("How many movies have you watched? ");
            int film = scanner.nextInt();
            scanner.nextLine();
            if (film == 0) {
                System.out.println("You havent watched any movies!");
                break;
            }
            System.out.println("How many of these film won awards? ");
            int awards = scanner.nextInt();
            scanner.nextLine();
            if (awards > 0) {
                double filmProcent = ((double) awards / film) * 100;
                System.out.println("Films procent with awards: " + filmProcent + " %");
            } else {
                System.out.println("No film procent");
            }
        }
        while (true);
        scanner.close();
    }
}