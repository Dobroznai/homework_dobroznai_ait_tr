package de.ait.consultation;

public class consultation02 {

    /*
    Напишите программу,
    которая принимает на вход число и определяет, является ли оно чётным или нечётным.

    Write a program that accepts a number and determines if it is even or odd.
     */

    public static void main(String[] args) {
        int number = 33;
        if (number % 2 == 0) {
            // Если число делится на 2 без остатка, то оно чётное.
            // If the number is divisible by 2 without remainder, it is even.
            System.out.println("Number " + number + " is even");
        } else {
            // Иначе число нечётное.
            // Otherwise, the number is odd.
            System.out.println("Number " + number + " is odd");
        }


        /*
        Напишите программу,
        которая принимает три числа и выводит наибольшее из них.

        Write a program that accepts three numbers and prints the largest one.
         */
        // Примеры:
        // 20 15 25 --> 25
        // 20 25 15 --> 25
        // 25 15 20 --> 25
        // 25 25 25 --> 25

        int numberOne = 25;
        int numberTwo = 24;
        int numberThree = 27;

        // Сначала проверим, является ли numberOne наибольшим.
        // First, we check if numberOne is the largest.
        if (numberOne > numberTwo) {
            if (numberOne > numberThree) {
                // Если numberOne больше обоих других чисел, выводим его.
                // If numberOne is larger than both other numbers, we print it.
                System.out.println(numberOne + " is the largest number");
            }
        }
        // Затем проверим numberTwo.
        // Then, we check numberTwo.
        if (numberTwo > numberOne) {
            if (numberTwo > numberThree) {
                // Если numberTwo больше остальных, выводим его.
                // If numberTwo is larger than the others, we print it.
                System.out.println(numberTwo + " is the largest number");
            }
        }

        /*
        Закомментированный код проверяет, является ли numberThree наибольшим, но он неактивен.

        The commented-out code checks if numberThree is the largest, but it is currently inactive.
        */
        // if(numberThree > numberOne){
        //     if(numberThree > numberTwo){
        //         System.out.println(numberThree + " is the largest number 3");
        //     }
        // }

        // Проверка на случай, если все три числа равны.
        // Check if all three numbers are equal.
        if (numberOne == numberTwo) {
            if (numberOne == numberThree) {
                System.out.println(numberOne + " is the largest number");
            }
        } else {
            // Если numberThree больше остальных или нет равенства, выводим его.
            // If numberThree is the largest or there is no equality, we print it.
            System.out.println(numberThree + " is the largest number");
        }
    }
}