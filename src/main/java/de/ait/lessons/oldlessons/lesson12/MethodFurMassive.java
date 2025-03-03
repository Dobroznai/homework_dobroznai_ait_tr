package de.ait.lessons.oldlessons.lesson12;

public class MethodFurMassive {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        printArray(numbers); // Передаем массив в метод

    }
}
