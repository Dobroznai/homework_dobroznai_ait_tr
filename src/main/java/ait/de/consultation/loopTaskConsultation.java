package ait.de.consultation;

import java.util.Scanner;

public class loopTaskConsultation {

    /*
    Кинобюджет
    Создайте программу, которая с помощью цикла for принимает информацию о
    бюджетах 5 фильмов и подсчитывает общую сумму этих бюджетов.
     */

    static int filmBudget;
    static int totalBudget = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the film budget number " + i + ": ");
            filmBudget = scanner.nextInt();
            scanner.nextLine();
            totalBudget = totalBudget + filmBudget;
        }
        System.out.println("Total Budget : " + totalBudget);
        scanner.close();
    }
}