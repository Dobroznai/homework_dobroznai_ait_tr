package de.ait.lessons.oldlessons.lesson10.contin;

import java.util.Scanner;

public class Task1 {
    /*
        Разделение названия животного на символы
    Задание:
    Напишите программу, которая запрашивает у пользователя название животного и выводит каждый символ этого названия на новой строке.
    Подсказки:
    Используйте цикл for для перебора каждого символа строки.
    Пример:
    Введите название животного: Тигр
    Вывод:
    Т
    и
    г
    р
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine().trim();
        int length = animal.length();
        String newWord = "";

        for (int i = length; i > 0; i++) {
            char letter = animal.charAt(i);
            newWord = newWord.concat(String.valueOf("\n" + letter));
            System.out.println(newWord);


        }}}