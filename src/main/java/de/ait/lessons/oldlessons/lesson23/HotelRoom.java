package de.ait.lessons.oldlessons.lesson23;

/*

Задание 1: Проверка корректности расчета стоимости номера
Описание:
В классе HotelRoom есть метод calculatePrice(int nights), который рассчитывает стоимость проживания в номере в зависимости от количества ночей. Стоимость за одну ночь составляет 100 долларов.
Требуется:
Написать параметризованный тест, который проверяет корректность расчета стоимости для различных значений nights (1, 2, 5, 10).
Подсказка:
Используйте аннотацию @ValueSource.
 */
public class HotelRoom {

    int price = 50;

    public int calculatePrice(int nights) {
        if (nights <= 0) {
            return -1;
        }
        return price * nights;
    }
}

