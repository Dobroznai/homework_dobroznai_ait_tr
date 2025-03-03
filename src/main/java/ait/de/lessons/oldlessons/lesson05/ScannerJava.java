package ait.de.lessons.oldlessons.lesson05;

import java.util.Scanner;

public class ScannerJava {

    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с консоли
        // Creating a Scanner object to read data from the console
        Scanner scanner = new Scanner(System.in);

        // Считываем целое число (возраст пользователя)
        // Reading an integer (user's age)
        System.out.println("Enter your age:");
        int age = scanner.nextInt();  // Вводим целое число / Input integer value
        System.out.println("Your age: " + age);  // Выводим возраст пользователя / Output user's age

        // Считываем число с плавающей точкой (вес пользователя)
        // Reading a double value (user's weight)
        System.out.println("Enter your weight:");
        double weight = scanner.nextDouble();  // Вводим значение типа double / Input double value
        scanner.nextLine();  // Очищаем буфер ввода после ввода числа / Clearing input buffer after number input
        System.out.println("Your weight: " + weight);  // Выводим вес пользователя / Output user's weight

        // Считываем строку (имя пользователя), включая пробелы
        // Reading a string (user's name), including spaces
        System.out.println("Enter your name:");
        String name = scanner.nextLine();  // Вводим строку с пробелами / Input string with spaces
        System.out.println("Your name: " + name);  // Выводим имя пользователя / Output user's name

        // Считываем логическое значение (любите ли вы Java)
        // Reading a boolean value (do you like Java)
        System.out.println("Do you like Java?: (true or false)");
        boolean likeJava = scanner.nextBoolean();  // Вводим значение true или false / Input true or false
        System.out.println("You like Java: " + likeJava);  // Выводим результат / Output the result

        // Закрываем сканер для освобождения ресурсов
        // Closing the scanner to free up resources
        scanner.close();
    }
}