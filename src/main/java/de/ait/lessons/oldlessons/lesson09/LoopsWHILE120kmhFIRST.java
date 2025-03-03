package de.ait.lessons.oldlessons.lesson09;

import java.util.Scanner;

public class LoopsWHILE120kmhFIRST {


    static int speed;
    static final int maxSpeed = 120;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start speed auto (km) : ");
        speed = scanner.nextInt();

        while (speed <= maxSpeed) {
            System.out.println("Speed: " + speed + " km/h");
            speed++;
        }
        scanner.close();
    }
}
