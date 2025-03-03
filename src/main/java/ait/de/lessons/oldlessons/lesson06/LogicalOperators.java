package ait.de.lessons.oldlessons.lesson06;
import java.util.Scanner;

public class LogicalOperators {
    public class LogicalOperatorsTasks3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int fine; // Variable to store the fine amount / Переменная для хранения суммы штрафа

            // Prompt user to indicate if they have a ticket (true/false) / Запросите у пользователя, есть ли у него билет (true/false)
            System.out.println("У вас есть билет? (true/false):");
            boolean hasTicket = scanner.nextBoolean();

            // If user does not have a ticket, set the fine to 50 / Если у пользователя нет билета, назначить штраф в размере 50
            if (!hasTicket) { // Equivalent to "hasTicket == false" / Эквивалентно "hasTicket == false"
                fine = 50;
            }
            else { // If user has a ticket, no fine is applied / Если у пользователя есть билет, штраф не назначается
                fine = 0;
            }

            // Display the fine amount / Вывод суммы штрафа
            System.out.println("Fine: " + fine);

            // Close the scanner to prevent resource leak / Закрытие сканера для предотвращения утечки ресурсов
            scanner.close();
        }
    }
}
