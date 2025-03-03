package ait.de.lessons.oldlessons.lesson12;


/*
Напишите метод,
который принимает на вход массив целых чисел
и возвращает сумму всех элементов массива.
*/
/*
Write a method that takes an array of integers as input
and returns the sum of all elements in the array.
*/

public class ArraysInJavaTasks2 {
    public static void main(String[] args) {
        // Создаем массив целых чисел и инициализируем его тремя значениями
        // Create an array of integers and initialize it with three values
        int[] numbers = {34000, 30000, 12000};

        // Инициализируем переменную result для хранения суммы элементов массива
        // Initialize a variable 'result' to store the sum of array elements
        int result = 0;

        // Цикл для суммирования всех элементов массива
        // Loop to sum all the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            // Добавляем каждый элемент массива к результату
            // Add each element of the array to the result
            result = result + numbers[i];
        }

        // Выводим итоговую сумму элементов массива на экран
        // Print the final sum of array elements to the console
        System.out.println(result);
    }
}