package de.ait.lessons.oldlessons.lesson09;


public class continie {

    // Проверить числа от 1 до 1000, остановить на 234, использовать continie

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            if (i == 234) {
                System.out.println("Finding 234");
                continue;
            } else {
                System.out.println("Checking " + i);
            }
        }
        System.out.println("End Program");
    }
}