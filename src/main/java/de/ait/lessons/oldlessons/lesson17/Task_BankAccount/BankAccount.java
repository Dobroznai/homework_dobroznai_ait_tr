package de.ait.lessons.oldlessons.lesson17.Task_BankAccount;

public class BankAccount {
    String accountNumber; //• accountNumber (номер счета) — строка.
    String acoountHolder; //• accountHolder (владелец счета) — строка.
    double balance = 0.0; //• balance (баланс) — число с плавающей точкой (double), начальное значение — 0.0.

    public BankAccount(String accountNumber, String acoountHolder) {
        this.accountNumber = accountNumber;
        this.acoountHolder = acoountHolder;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String acoountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.acoountHolder = acoountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (balance < 0) {
            System.out.println("Invalid Balance" + "\n -----------------------");
        } else {
            balance += amount;
            System.out.println("New Balance: " + balance + "\n -----------------------");
        }
    }

    public void withdraw(double amount) {
        if (balance < amount || amount < 0) {
            System.err.println("Invalid Balance. Wrong amount" + "\n" + balance + "\n -----------------------");
        } else {
            balance -= amount;
            System.out.println("Withdraw: " + amount + "\n" + "New Balance: " + balance + "\n -----------------------");
        }
    }

    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber + "\n" + "Владелец счет: " + acoountHolder + "\n" + "Текущий баланс: " + balance + "\n -----------------------");
    }

}

