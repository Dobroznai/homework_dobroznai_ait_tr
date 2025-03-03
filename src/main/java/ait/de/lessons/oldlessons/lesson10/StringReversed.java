package ait.de.lessons.oldlessons.lesson10;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        /*
        Напишите программу, которая проверяет, является ли введенная
        пользователем строка палиндромом.
        Игнорируйте пробелы, знаки препинания и регистр букв.

        Write a program that checks if the entered string is a palindrome.
        Ignore spaces, punctuation, and letter case.
         */
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя строку для проверки на палиндром
        // Asking the user for a string to check if it is a palindrome
        System.out.println("Word to check: ");
        String word = scanner.nextLine().trim(); // Убираем пробелы в начале и конце строки / Trimming spaces at the start and end of the string

        // Получаем длину строки
        // Getting the length of the string
        int length = word.length();

        // Создаем пустую строку, которая будет содержать перевернутую строку
        // Creating an empty string to store the reversed string
        String reversed = "";

        // Цикл for для переворота строки
        // For loop to reverse the string
        for (int i = length - 1; i >= 0; i--) {
            char letter = word.charAt(i); // Получаем символ по индексу / Getting the character by index
            // String.valueOf(letter) --> преобразует символ в строку 'c'--> "c"
            // String.valueOf(letter) --> converts the character to a string 'c'--> "c"
            reversed = reversed.concat(String.valueOf(letter)); // Добавляем символ к перевернутой строке / Adding the character to the reversed string
        }

        // Проверяем, равна ли исходная строка перевернутой, игнорируя регистр
        // Checking if the original string is equal to the reversed string, ignoring case
        if (reversed.equalsIgnoreCase(word)) {
            System.out.println("Yes, it is a palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }

        // Пример: Anna --> annA
        // Example: Anna --> annA

        // Закрываем сканер
        // Closing the scanner
        scanner.close();
    }
}