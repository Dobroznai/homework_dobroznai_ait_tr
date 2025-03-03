package ait.de.lessons.oldlessons.lesson09;

import java.util.Scanner;

public class loopDOWHILE {

// Создайте программу, которая запрашивает у пользователя числа
// и выводит их, пока пользователь не введет отрицательное число.
//Используйте цикл do-while и оператор break.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Cycle stop");
                break;
            }
            System.out.println("You entered: " + number);
        }

        while (true);
        System.out.println("End Program");
        scanner.close();
    }
}