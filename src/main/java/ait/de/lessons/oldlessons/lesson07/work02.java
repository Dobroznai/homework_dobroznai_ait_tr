package ait.de.lessons.oldlessons.lesson07;
import java.util.Scanner;
public class work02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthOfYear = scanner.nextInt();


        String yearPeriodResult = switch (monthOfYear) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "autumn";
            default -> "Invalid day of week";
        };

        System.out.println(yearPeriodResult);


        scanner.close();
    }
}
