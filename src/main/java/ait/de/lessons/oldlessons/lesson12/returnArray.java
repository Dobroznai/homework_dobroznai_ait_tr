package ait.de.lessons.oldlessons.lesson12;

public class returnArray {

    // Методы могут принимать массивы в качестве аргументов и возвращать их в качестве результата.
    // Пример метода, возвращающего массив:

    public static int[] createArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = i * 10; // заполняем массив
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = createArray(6); // создаем массив
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
