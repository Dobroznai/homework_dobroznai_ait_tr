package de.ait.consultation;

import java.util.Scanner;

public class NewCreditInformation {

    /*
         Ежемесячные выплаты по кредиту
    Задание:
    Напишите программу, которая симулирует ежемесячные выплаты по кредиту.
    Программа должна запрашивать сумму кредита, процентную ставку и количество месяцев.
     Для каждого месяца программа должна выводить текущую сумму кредита
      и сколько было выплачено.

    Подсказки:

        •	Используйте цикл для расчета ежемесячных выплат с учетом процентов.
        •	Выплаты должны уменьшать основной долг, а проценты начисляться на оставшуюся сумму.

    Пример:
    Введите сумму кредита: 1200
    Введите процентную ставку: 2
    Введите количество месяцев: 3

    Месяц 1: Выплачено: 400, Остаток долга: 816        1200 - 400 + (1200*2%) = 816   -->   A
    Месяц 2: Выплачено: 400, Остаток долга: 432.32       816  -  400 + (816*2%) -->
    Месяц 3: Выплачено: 400, Остаток долга: 48.96
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных от пользователя
        System.out.print("Введите сумму кредита: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Введите годовую процентную ставку (например, 2 для 2%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();

        calculateCredit(loanAmount, months, annualInterestRate);

        scanner.close();
    }

    private static void calculateCredit(double loanAmount, int months, double annualInterestRate) {
        // Рассчитаем ежемесячный платеж (без учета процентов)
        double monthlyPayment = loanAmount / months;

        // Конвертируем годовую процентную ставку в месячную
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        // Процесс выплат по кредиту
        double remainingLoan = loanAmount;

        for (int month = 1; month <= months; month++) {
            // Рассчитываем проценты перед вычетом платежа
            double interest = remainingLoan * monthlyInterestRate;

            // Выводим информацию о текущем платеже
            if (remainingLoan + interest <= monthlyPayment) {
                // Последний платеж
                System.out.printf("Месяц %d: Выплачено: %.2f, Остаток долга: 0.00%n", month, remainingLoan + interest);
                break;
            }

            // Обновляем оставшуюся сумму после выплаты и начисления процентов
            remainingLoan += interest;
            remainingLoan -= monthlyPayment;

            // Выводим информацию за месяц
            System.out.printf("Месяц %d: Выплачено: %.2f, Остаток долга: %.2f%n", month, monthlyPayment, remainingLoan);
        }
    }
}