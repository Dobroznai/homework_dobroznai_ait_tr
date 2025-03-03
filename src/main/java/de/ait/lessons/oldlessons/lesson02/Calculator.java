package de.ait.lessons.oldlessons.lesson02;

public class Calculator {

    public static void main(String[] args) {

        int numberOne =200;
        int numberTwo =150;

        int result = add(numberOne, numberTwo);
        System.out.println(result);

    }


    public static int add(int a, int b) {
        int sum = a + b;
        return sum;

    }


}
