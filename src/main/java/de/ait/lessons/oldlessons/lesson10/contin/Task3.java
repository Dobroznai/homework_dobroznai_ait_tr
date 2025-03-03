package de.ait.lessons.oldlessons.lesson10.contin;

import java.util.Scanner;

public class Task3 {
    /*
        Создание предложения о животном
    Задание:
    Напишите программу, которая запрашивает у пользователя название животного и одну характеристику
    (например, “быстрый” или “умный”), а затем создает предложение, используя введенные данные.
    Подсказки:
    Используйте метод concat() или оператор + для объединения строк.
    Пример
    Введите название животного: Лиса
    Введите характеристику животного: хитрая
    Вывод:
    Лиса - это хитрое животное.
     */

    static String animal;
    static String characteristic;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите название животного: ");
            animal = scanner.nextLine().trim();
            System.out.println("Введите характеристику животного: ");
            characteristic = scanner.nextLine().trim();


            String replaceResult = characteristic.replace('а', 'о').replace('я', 'е');

            System.out.println(animal + " - " + replaceResult + " животное");

        } while (true);
    }
}