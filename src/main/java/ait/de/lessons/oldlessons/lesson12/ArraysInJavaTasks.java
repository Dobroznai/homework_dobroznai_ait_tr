package ait.de.lessons.oldlessons.lesson12;


/*
Создайте массив строк,
состоящий из 5 имен.
Выведите на экран все имена в обратном порядке.

Create an array of strings consisting of 5 names.
Display all the names in reverse order.
*/

public class ArraysInJavaTasks {
    public static void main(String[] args) {
        // Создаем массив строк для хранения 5 имен
        // Create an array of strings to store 5 names
        String[] names = new String[5];

        // Инициализируем каждый элемент массива именами
        // Initialize each element of the array with names
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Jill";
        names[3] = "Jakob";
        names[4] = "Max";

        // Получаем длину массива
        // Get the length of the array
        int lengthNamesArray = names.length;

        // Цикл для вывода имен в обратном порядке
        // Loop to display the names in reverse order
        for (int i = lengthNamesArray - 1; i >= 0; i--) {
            // Выводим текущее имя из массива
            // Print the current name from the array
            System.out.println(names[i]);
        }
    }
}