package ait.de.lessons.oldlessons.lesson06;

import java.util.Scanner;

public class IndependentWork01 {

    /*
   Выбор сеанса / Movie Session Selection
   **Условие / Condition:**
   Кинотеатр предлагает два типа сеансов: утренний и вечерний.
   Пользователь может выбрать сеанс, если:
   - Это утренний сеанс, и у него есть студенческий билет.
   - **ИЛИ**
   - Это вечерний сеанс, и он имеет обычный билет.

   **Требования / Requirements:**
   - Запросите у пользователя время сеанса (`утро`/`вечер`).
   - Запросите, есть ли у пользователя студенческий билет (`true`/`false`).
   - Запросите, есть ли у пользователя обычный билет (`true`/`false`).
   - Выведите сообщение о том, может ли пользователь выбрать выбранный сеанс.

   **Пример работы программы / Example Output:**
   ```
   Введите время сеанса (утро/вечер): утро
   У вас есть студенческий билет? (true/false): true
   У вас есть обычный билет? (true/false): false
   Вы можете выбрать утренний сеанс.
   ```
    */

    // morning      evening     studentTicket       normalTicket        morningMovie        eveningMovie
    // x                            x                                       x
    //                  x                               x                                       x

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите время сеанса (утро/вечер): ");
        String time = scanner.nextLine();

        System.out.println("Есть ли у вас студенческий билет? (true/false)");
        boolean studentTicket = scanner.nextBoolean();

        System.out.println("Есть ли у вас обычный билет? (true/false)");
        boolean standartTicket = scanner.nextBoolean();

        if (time.equals("утро") && studentTicket) {
            System.out.println("Вы можете выбрать утренний сеанс.");
        } else if (time.equals("вечер") && standartTicket) {
            System.out.println("Вы можете выбрать вечерний сеанс.");
        } else {
            System.out.println("У вас нет возможности просмотреть фильм");
        }

        //-------Variant 2 ----------------
        // An alternative approach to the first solution / Альтернативный подход к первому решению

        // Consume the newline character left by nextBoolean / Потребление символа новой строки, оставленного nextBoolean
        scanner.nextLine();

        // Prompt user for preferred time (morning/evening) in English / Запросите время сеанса (утро/вечер) на английском
        System.out.println("Type here your preferred time (morning or evening)");
        String bestTime = scanner.nextLine();

        // Prompt user if they have a student pass in English / Запросите наличие студенческого билета на английском
        System.out.println("Do you have a student pass? (true/false):");
        boolean studentPass = scanner.nextBoolean();

        // Prompt user if they have a cinema ticket in English / Запросите наличие обычного билета на английском
        System.out.println("Do you have a cinema ticket? (true/false):");
        boolean cinemaTicket = scanner.nextBoolean();

        // Check conditions for morning session / Проверка условий для утреннего сеанса
        if (bestTime.equals("morning") && studentPass) {
            System.out.println("You can visit morning cinema.");
        } else if (bestTime.equals("morning")) {
            System.out.println("You cannot visit morning cinema.");
        }

        // Check conditions for evening session / Проверка условий для вечернего сеанса
        if (bestTime.equals("evening") && cinemaTicket) {
            System.out.println("You can visit evening cinema.");
        } else if (bestTime.equals("evening")) {
            System.out.println("You cannot visit evening cinema.");
        }

        // Close scanner to prevent resource leaks / Закрытие сканера для предотвращения утечки ресурсов
        scanner.close();
    }
}
