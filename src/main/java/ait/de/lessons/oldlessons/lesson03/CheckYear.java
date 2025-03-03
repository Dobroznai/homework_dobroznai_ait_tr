package ait.de.lessons.oldlessons.lesson03;

public class CheckYear {
    public static void main(String[] args) {
        int checkYear = 2020;

        double resultDouble = checkYear / 4.0;
        int resultInt = checkYear / 4;

        boolean finalResult = resultDouble > resultInt;

        System.out.println("Не высокосный год: " + finalResult);
    }
}
