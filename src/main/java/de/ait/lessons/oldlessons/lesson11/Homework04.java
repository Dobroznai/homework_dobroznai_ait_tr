package de.ait.lessons.oldlessons.lesson11;

import java.util.Scanner;

public class Homework04 {
    /*
    Упражнение 4: Симуляция банковского счета с пополнением и снятием

    Напишите программу, которая симулирует банковский счет. Программа должна запрашивать у пользователя начальный баланс,
    а затем предлагать выбрать операцию (пополнение или снятие). После каждой операции программа должна выводить текущий баланс.
    Снятие не может превышать доступную сумму.

    Подсказки:

    •	Используйте цикл для многократного выбора операции.
    •	Проверяйте корректность операции (например, сумма снятия не должна быть больше баланса).
    •	Для простоты вводите и выводите суммы в целых числах.

    Пример:
    Введите начальный баланс: 1000
    Выберите операцию (пополнение/снятие): пополнение
    Введите сумму: 500

    Текущий баланс: 1500
    Выберите операцию (пополнение/снятие): снятие
    Введите сумму: 600

    Текущий баланс: 900

    Выберите операцию (пополнение/снятие): снятие
    Введите сумму: 1000

    Ошибка: Недостаточно средств.
     */

    static int balance;
    static String operator;
    static int sum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your start balance: ");
        balance = scanner.nextInt();
        scanner.nextLine();
        while (true) {
            System.out.println("Enter operator('+' for top up/'-' for withdrawal): ");
            operator = scanner.nextLine();if (operator.equals("+") || operator.equals("-")) {
                System.out.println("Enter the amount: ");
                sum = scanner.nextInt();
                scanner.nextLine();
                performOperation();
            } else {
                System.out.println("Invalid request");
                System.out.println("Your balance is: " + balance);
            }
            System.out.println("Do you want to continue(Press '000' to exit or 'yes' to continue)?");
            String exit = scanner.nextLine();
            if (exit.equals("000")) {
                break;
            }
        }
        scanner.close();
    }

    private static void performOperation() {
        //switch-case !!!
        if (operator.equals("+")) {
            balance += sum;
            System.out.println("The operation was successful!");
            System.out.println("Your balance is: " + balance);
        } else if (operator.equals("-")) {
            if (balance > sum) {
                balance = balance - sum;
                System.out.println("The operation was successful!");
                System.out.println("Your balance is: " + balance);
            } else {
                System.out.println("Not enough funds");
                System.out.println("Your balance is: " + balance);
            }
        }
    }
}