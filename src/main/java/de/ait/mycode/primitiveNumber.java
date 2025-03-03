package de.ait.mycode;

public class primitiveNumber {

    static int number = 50;

    static void add(int num) {
        num = num + 40;
    }

    public static void main(String[] args) {
        add(number);
        System.out.println(number);
    }
}
