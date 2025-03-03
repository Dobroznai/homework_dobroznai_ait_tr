package ait.de.lessons.oldlessons.lesson07;

import java.util.Scanner;

public class Lesson07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day of week (1-7):");
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of week");
        }


        String result = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid day of week";
        };
        System.out.println(result);

        String dayOfWeekResult = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Working day");
                yield "return working day ";
            }
            case 6, 7 -> {
                System.out.println("Weekend");
                yield "return Weekend ";
            }
            default -> "Invalid day of week";
        };

        System.out.println(dayOfWeekResult);


        scanner.close();
    }
}
