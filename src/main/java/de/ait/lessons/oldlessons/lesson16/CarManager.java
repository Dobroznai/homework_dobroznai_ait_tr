package de.ait.lessons.oldlessons.lesson16;

//обьект(представитель класса) от сущности Car
public class CarManager {
    public static void main(String[] args) {

        //создаем объект класса Car
        /*Car carAudi = new Car();

        //устанавливаем значение для полей
        carAudi.brand = "Audi";
        carAudi.color = "Red";
        carAudi.year = 2016;
        carAudi.preis = 35000;
        carAudi.miles = 2500;
        carAudi.horsepower = 250;*/

        Car carBMW = new Car(5000, "BMW", 2007, "blue", 30000, 400);
        //вызов метода showCarinfo
        carBMW.showCariInfo();


    }
}
