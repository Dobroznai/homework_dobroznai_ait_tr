package de.ait.lessons.oldlessons.lesson04;

public class JavaOperatorsTasks {
    // Напишите программу, которая определяет категорию товара на основе его цены и наличия скидки.
    // Write a program that determines the product category based on its price and discount availability.

    // цена > 10 000 и скидка 5% это люксовый товар
    // price > 10,000 and 5% discount is a luxury product
    // цена <= 10 000 и скидка 25% это бюджетный товар
    // price <= 10,000 and 25% discount is an economy product

    static double economPreis = 10000; // Граница цены для бюджетного товара / Price threshold for economy product
    static double luxDiscount = 0.05; // Скидка на люксовый товар / Luxury product discount
    static double preis = 14000; // Начальная цена товара / Initial product price
    static double economDiscount = 0.25; // Скидка на бюджетный товар / Economy product discount

    public static void main(String[] args) {
        System.out.println("Start preis " + preis); // Вывод начальной цены / Output the initial price
        if (preis <= economPreis) { // Проверка, является ли товар бюджетным / Checking if the product is economy class
            System.out.println("Economy class"); // Товар относится к бюджетному классу / Product is economy class
            preis = preis - preis * economDiscount; // Применение скидки 25% / Applying 25% discount
            System.out.println("Discount preis " + preis); // Вывод цены со скидкой / Output the discounted price
        } else { // Иначе товар люксовый / Otherwise, the product is luxury class
            System.out.println("Business class"); // Товар относится к люксовому классу / Product is luxury class
            preis = preis - preis * luxDiscount; // Применение скидки 5% / Applying 5% discount
            System.out.println("Lux preis " + preis); // Вывод цены со скидкой / Output the discounted price
        }
    }
}