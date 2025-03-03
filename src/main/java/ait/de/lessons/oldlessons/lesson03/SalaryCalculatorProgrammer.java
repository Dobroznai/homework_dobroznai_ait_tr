package ait.de.lessons.oldlessons.lesson03;

public class SalaryCalculatorProgrammer {
    // переменные
    static int salaryBrutto = 38000;
    static double incometax = 0.42;
    static double socialSecurityContributions = 0.195;
    static int additionalExpense = 800;



    public static void main(String[] args) {
        double salaryBruttoMonth = salaryBrutto/12;
        double salaryNetto = salaryBruttoMonth - (salaryBrutto * incometax) - (salaryBrutto * socialSecurityContributions);
        System.out.println("salaryNetto: " + salaryNetto);
        double finalSum = salaryNetto - additionalExpense;

    }
}
