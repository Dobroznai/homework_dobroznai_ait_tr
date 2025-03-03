package ait.de.lessons.oldlessons.lesson17.Task_BankAccount;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1111", "Muller");
        bankAccount.displayInfo();

        BankAccount bankAccountBalance = new BankAccount("2222", "Koch", 50000);
        bankAccountBalance.displayInfo();

        bankAccountBalance.deposit(500);
        bankAccountBalance.withdraw(6000);


    }
}
