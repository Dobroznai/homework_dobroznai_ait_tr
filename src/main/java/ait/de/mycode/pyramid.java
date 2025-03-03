package ait.de.mycode;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        System.out.println("How many Rows you want?");
        Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();
        int rowCount = noOfRows;
        sc.close();
        System.out.print("Here is your pyramid \n \n");
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount--;
        }
    }
}
