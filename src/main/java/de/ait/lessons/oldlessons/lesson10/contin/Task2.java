package de.ait.lessons.oldlessons.lesson10.contin;

import java.util.Scanner;
public class Task2 {
    /*
    Замена символов в названиях животных
Задание:
Напишите программу, которая запрашивает у пользователя название животного и заменяет все буквы “о” в этом названии на “а”.
Подсказки:
Используйте метод replace() для замены символов в строке.
Пример:
Введите название животного: Собака
Вывод:
Сабака
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name animal: ");
            String animal = scanner.nextLine();

            String replaceResult = animal.replace('o', 'a');
            System.out.println(replaceResult);
        }
    }
}
