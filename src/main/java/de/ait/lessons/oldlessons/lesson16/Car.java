package de.ait.lessons.oldlessons.lesson16;

// создаем сущность

public class Car {

    // поля класса
    double preis;
    String brand;
    int year;
    String color;
    int miles;
    int horsepower;

    public Car(double preis, String brand, int year, String color, int miles, int horsepower) {
        this.preis = preis;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.miles = miles;
        this.horsepower = horsepower;
    }

    // метод класса
    public void showCariInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Preis: " + preis);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Miles: " + miles);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("---------------------------");
    }
}
