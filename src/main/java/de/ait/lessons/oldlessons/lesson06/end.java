package de.ait.lessons.oldlessons.lesson06;
import java.util.Scanner;
public class end {

        /**
         * **Условие:**
         * Пользователь может войти в кинотеатр, если ему исполнилось 18 лет **и** у него есть билет.
         * Если пользователю меньше 18, но у него есть сопровождающий взрослый и билет, доступ разрешен.
         *
         * **Требования:**
         * - Запросите у пользователя его возраст.
         * - Запросите, есть ли у него билет (`true`/`false`).
         * - Если возраст меньше 18, спросите, есть ли с ним взрослый сопровождающий (`true`/`false`).
         * - Выведите сообщение о том, разрешен ли вход.
         *
         * **Пример работы программы:**
         * ```
         * Введите ваш возраст: 17
         * У вас есть билет? (true/false): true
         * У вас есть сопровождающий взрослый? (true/false): true
         * Доступ разрешен.
         * ```
         */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрос возраста пользователя / Request user's age
            System.out.println("Введите ваш возраст:");
            int age = scanner.nextInt();

            // Запрос информации о наличии билета / Request information about having a ticket
            System.out.println("У вас есть билет? (true/false):");
            boolean hasTicket = scanner.nextBoolean();

            // Проверка условий допуска / Checking access conditions
            if (age >= 18 && hasTicket) {
                // Если возраст >= 18 и есть билет / If age is >= 18 and the user has a ticket
                System.out.println("Доступ разрешен."); // Access granted
            } else if (age < 18 && hasTicket) {
                // Если возраст < 18 и есть билет / If age is < 18 and the user has a ticket
                System.out.println("У вас есть сопровождающий взрослый? (true/false): ");
                boolean hasCousin = scanner.nextBoolean(); // Проверка наличия взрослого сопровождающего / Checking for an adult guardian
                if (hasCousin) {
                    // Если есть взрослый сопровождающий / If there is an adult guardian
                    System.out.println("Доступ разрешен."); // Access granted
                } else {
                    // Если взрослого сопровождающего нет / If there is no adult guardian
                    System.out.println("Доступ не разрешен."); // Access denied
                }
            } else {
                // Если не выполнены другие условия (нет билета) / If other conditions are not met (no ticket)
                System.out.println("Доступ не разрешен."); // Access denied
            }

            // Закрываем сканер / Closing the scanner
            scanner.close();
        }
    }
