package de.ait.homeworks.homework32;

/*
Класс Apartment (Квартира):
Поля:
String address (адрес);
int floor (этаж);
double area (площадь в квадратных метрах);
boolean hasElevator (наличие лифта).
Реализация метода calculatePrice:
Базовая цена за 1 квадратный метр: 1000 евро;
Если есть лифт, цена увеличивается на 5%.
 */

public class Apartment extends Property {

    private String address; // адрес
    private int floor; // этажт
    private double area; // площадь в квадратных метрах
    private boolean hasElevator; //наличие лифта
    private static final double COST_PER_SQUARE_METER = 1000; // Базовая цена за м²

    public Apartment(String address, int floor, double area, boolean hasElevator, double costArea) {
        this.address = address;
        this.floor = floor;
        this.area = area;
        this.hasElevator = hasElevator;
    }

    // Реализация метода calculatePrice
    @Override
    public double calculatePrice() {
        double basePrice = area * COST_PER_SQUARE_METER;
        if (hasElevator) {
            basePrice *= 1.05; // Увеличение цены на 5%
        }
        return basePrice;
    }

    // Реализация метода printDetails
    @Override
    public void printDetails() {
        System.out.println("Address: " + address);
        System.out.println("Floor: " + floor);
        System.out.println("Area: " + area + " m²");
        System.out.println("Has elevator: " + (hasElevator ? "Yes" : "No"));
        System.out.println("Price: " + calculatePrice() + " EUR");
    }
}