package de.ait.lessons.oldlessons.lesson09;
import java.util.Scanner;

public class loopWHILE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number: ");
        int maxNumber = scanner.nextInt();

        int i = 1; // Начальное число

        while (i <= maxNumber ) {
            if (i % 2 == 0) { // проверка через модуле деление на 2
                System.out.println(i);
            }
            i++;
        }
        System.out.println("End Program");
    }
}