package de.ait.lessons.oldlessons.lesson10.contin;
    import java.util.Scanner;

public class Task4 {
    /*
        Напишите программу, которая запрашивает у пользователя несколько названий животных и выводит самое длинное и
        самое короткое название среди введенных.
    Подсказки:
    Используйте цикл для ввода названий животных.
    Примените метод length() для проверки длины каждого названия.
    Пример:
    Введите название животного (или пустую строку для завершения): Кошка
    Введите название животного (или пустую строку для завершения): Лев
    Введите название животного (или пустую строку для завершения): Крокодил

    Вывод:
    Самое длинное название: Крокодил
    Самое короткое название: Лев
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal;
        String longestAnimal = "";
        String shortestAnimal = null;

        System.out.println("Введите название животного (или пустую строку для завершения):");

        while (true) {
            animal = scanner.nextLine().trim();

            if (animal.isEmpty()) {
                break;
            }

            if (shortestAnimal == null || animal.length() < shortestAnimal.length()) {
                shortestAnimal = animal;
            }

            if (animal.length() > longestAnimal.length()) {
                longestAnimal = animal;
            }
        }

        if (shortestAnimal != null) {
            System.out.println("Самое длинное название: " + longestAnimal);
            System.out.println("Самое короткое название: " + shortestAnimal);
        } else {
            System.out.println("Вы не ввели ни одного названия животного.");
        }
        scanner.close();
    }
}

