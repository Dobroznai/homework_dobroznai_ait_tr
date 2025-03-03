package de.ait.lessons.oldlessons.lesson06;
import java.util.Scanner;
public class or {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their age / Запросите у пользователя ввод возраста
        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        // Prompt user to indicate if they have a ticket (true/false) / Запросите у пользователя, есть ли у него билет (true/false)
        System.out.println("У вас есть билет? (true/false):");
        boolean hasTicket = scanner.nextBoolean();

        // Prompt user to indicate if they are accompanied by an adult (true/false) / Запросите у пользователя, есть ли сопровождающий взрослый (true/false)
        System.out.println("У вас есть сопровождающий взрослый? (true/false): ");
        boolean hasCousin = scanner.nextBoolean();

        // Check conditions to grant access / Проверка условий для предоставления доступа
        //  age         ticket      cousin      result
        //  true        true        -----       true
        //  false       true        true        true
        //  false       false       ------      false
        //  true        false       ------      false
        //  false       true        false       false

        // Access is granted if:
        // 1. User is 18 or older AND has a ticket
        // 2. User is accompanied by an adult AND has a ticket
        // Доступ разрешен, если:
        // 1. Пользователь 18 лет или старше И у него есть билет
        // 2. Пользователь сопровождается взрослым И у него есть билет
        if ((age >= 18 && hasTicket) || (hasCousin && hasTicket)) {
            System.out.println("Доступ разрешен.");
        } else {
            System.out.println("Доступ не разрешен.");
        }

        // Close the scanner to prevent resource leak / Закрытие сканера для предотвращения утечки ресурсов
        scanner.close();
    }
}

