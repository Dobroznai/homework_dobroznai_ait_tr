package ait.de.lessons.oldlessons.lesson27;

/*
Упражнение 3: Создание класса “Коробка для подарков”
Создайте класс GiftBox, который содержит несколько подарков:
	1.	Добавьте приватное поле:
	•	ArrayList<Gift> gifts (список подарков в коробке).
	2.	Реализуйте методы:
	•	public void addGift(Gift gift) – добавляет подарок в коробку.
	•	public void removeGift(Gift gift) – удаляет подарок из коробки.
	•	public double getTotalPrice() – возвращает общую стоимость всех подарков.

	одифицируйте класс GiftBox:
	1.	Добавьте приватное поле double maxPrice (максимальная стоимость коробки).
	2.	Реализуйте:
	•	Конструктор, принимающий maxPrice.
	•	Проверьте в методе addGift, чтобы общая стоимость подарков в коробке не превышала maxPrice.
	Если превышает, выведите сообщение: “Нельзя добавить подарок, превышена максимальная стоимость.”
 */

import java.util.ArrayList;

public class GiftBox {

    private ArrayList<Gift> gifts;
    private double maxPrice;


    public GiftBox(double maxPrice) {
        this.gifts = new ArrayList<>();
        this.maxPrice = maxPrice;
    }

    public void addGift(Gift gift) {
        if (getTotalGifts() >= maxPrice) {
            gifts.add(gift);
        }
    }

    public void removeGift(Gift gift) {
        gifts.remove(gift);
    }

    public double getTotalGifts() {
        double total = 0;
        for (Gift gift : gifts) {
            total += gift.getPrice();
        }
        return total;
    }
}
