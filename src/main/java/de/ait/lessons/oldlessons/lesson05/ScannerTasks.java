package de.ait.lessons.oldlessons.lesson05;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerTasks {

    /* Приветствие пользователя
     * Напишите программу, которая:
     * 1. Считывает имя пользователя.
     * 2. Выводит сообщение: "Привет, [имя]!"
     *
     * User greeting
     * Write a program that:
     * 1. Reads the user's name.
     * 2. Prints a message: "Hello, [name]!"
     */

    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Выводим сообщение с именем пользователя
        // Display a message with the user's name
        System.out.println("Hallo " + name + "!");

        /*
         * Напишите программу, которая:
         * 1. Считывает два целых числа.
         * 2. Выводит их сумму.
         *
         * Write a program that:
         * 1. Reads two integers.
         * 2. Prints their sum.
         */
        System.out.println("Enter number one: ");
        int numberOne = scanner.nextInt();  // Считываем первое целое число / Reading the first integer
        System.out.println("Enter number two: ");
        int numberTwo = scanner.nextInt();  // Считываем второе целое число / Reading the second integer

        int sum = numberOne + numberTwo;  // Вычисляем сумму / Calculating the sum
        System.out.println("Sum of numbers: " + sum);  // Выводим результат / Output the result

        /*
         * Проверка на совершеннолетие
         * Напишите программу, которая:
         * 1. Считывает возраст пользователя.
         * 2. Если возраст 18 лет и больше, выводит: "Вы совершеннолетний".
         * 3. Если возраст меньше 18 лет, выводит: "Вы несовершеннолетний".
         *
         * Age verification
         * Write a program that:
         * 1. Reads the user's age.
         * 2. If the age is 18 or more, prints: "You are an adult."
         * 3. If the age is less than 18, prints: "You are a minor."
         */
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();  // Считываем возраст пользователя / Reading the user's age

        // Проверяем, является ли пользователь совершеннолетним / Checking if the user is an adult
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");  // Выводим сообщение о совершеннолетии / Printing adult message
        } else {
            System.out.println("Вы несовершеннолетний");  // Выводим сообщение о несовершеннолетии / Printing minor message
        }

        // Дополнительная часть программы: вычисление возраста по году рождения / Additional part: calculating age by birth year
        System.out.println("Enter your year of birth:");
        int year = scanner.nextInt();  // Считываем год рождения / Reading the birth year

        // Вычисляем возраст по году рождения / Calculating age from the birth year
        int ageOfBirth = LocalDate.now().getYear() - year;

        // Проверяем и выводим сообщение в зависимости от возраста / Checking and displaying message based on age
        if (ageOfBirth < 18) {
            System.out.println("You are " + ageOfBirth + " years old. You are a minor");
        } else {
            System.out.println("You are " + ageOfBirth + " years old. You are an adult");
        }

        /*
         * Перевод температуры
         * Напишите программу, которая:
         * 1. Считывает температуру в градусах Цельсия.
         * 2. Переводит её в градусы Фаренгейта по формуле: F = C * 9/5 + 32.
         * 3. Выводит результат.
         *
         * Temperature conversion
         * Write a program that:
         * 1. Reads a temperature in Celsius.
         * 2. Converts it to Fahrenheit using the formula: F = C * 9/5 + 32.
         * 3. Prints the result.
         */
        System.out.println("Enter a degree in Celsius:");
        double celsius = scanner.nextDouble();  // Считываем температуру в градусах Цельсия / Reading temperature in Celsius

        // Переводим температуру в Фаренгейты / Converting temperature to Fahrenheit
        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        // Выводим результат / Output the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Закрываем сканер, чтобы освободить ресурсы / Closing the scanner to free up resources
        scanner.close();
    }
}