package de.ait.lessons.oldlessons.lesson10;

import java.util.Scanner;

public class CharAt {
    /*
    Напишите программу, которая запрашивает у
пользователя строку и подсчитывает, сколько раз символ 'а'
(или 'А') встречается в этой строке.
     */
    public static void main(String[] args) {
        /*
        Напишите программу, которая запрашивает у
        пользователя строку и подсчитывает, сколько раз символ ‘а’
        (или ‘А’) встречается в этой строке.

        Write a program that asks the user for a string and counts
        how many times the letter 'a' (or 'A') appears in the string.
         */
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем строку у пользователя
        // Asking the user to input a string
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // Получаем длину строки
        // Getting the length of the string
        int length = word.length();

        // Инициализируем счетчик для подсчета символов 'a' и 'A'
        // Initializing a counter to count 'a' and 'A' characters
        int count = 0;

        // Цикл for для проверки каждого символа строки
        // For loop to check each character in the string
        for(int i = 0; i < length; i++){
            // Если текущий символ — 'a' или 'A', увеличиваем счетчик
            // If the current character is 'a' or 'A', increment the counter
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A'){
                count++;
            }
        }

        // Выводим количество символов 'a' или 'A' в строке
        // Printing the number of 'a' or 'A' characters in the string
        System.out.println("Number of 'a' in the word: " + count);

        // Закрываем сканер
        // Closing the scanner
        scanner.close();
    }
}