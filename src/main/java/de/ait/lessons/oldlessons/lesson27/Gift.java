package de.ait.lessons.oldlessons.lesson27;

/*
Упражнение 1: Создание класса с инкапсуляцией
Создайте класс Gift, который будет представлять подарок.
	1.	Добавьте приватные поля:
	•	String name (название подарка).
	•	double price (стоимость подарка).
	2.	Реализуйте:
	•	Геттеры и сеттеры для каждого поля.
	•	В сеттере setPrice добавьте проверку: стоимость не может быть отрицательной.
 */

/*
Упражнение 2: Дополнение функциональности с проверкой
Расширьте класс Gift:
	1.	Добавьте поле boolean isWrapped (завёрнут ли подарок).
	2.	Реализуйте методы:
	•	public void wrapGift() – заворачивает подарок (меняет isWrapped на true).
	•	public void unwrapGift() – разворачивает подарок (меняет isWrapped на false).
	•	Добавьте проверку: подарок нельзя завернуть, если его цена равна 0.
 */

public class Gift {

    private String name;
    private double price;
    private boolean isWrapped;

    public Gift(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;

        } else {
            System.err.println("Price must be greater than or equal to 0");
        }
    }

    public void wrapGift() {
        if (price != 0) {
            isWrapped = true;
            System.out.println("Gift has been wrapped.");
        } else {
            System.err.println("Gift cannot be wrapped as its price is 0.");
        }
    }
    public void unwrapGift() {
        isWrapped = false;
    }

}
