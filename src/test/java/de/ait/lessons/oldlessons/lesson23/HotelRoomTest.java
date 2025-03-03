package de.ait.lessons.oldlessons.lesson23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Задание 1: Проверка корректности расчета стоимости номера
Описание:
В классе HotelRoom есть метод calculatePrice(int nights), который рассчитывает стоимость проживания в номере в зависимости от количества ночей. Стоимость за одну ночь составляет 100 долларов.
Требуется:
Написать параметризованный тест, который проверяет корректность расчета стоимости для различных значений nights (1, 2, 5, 10).
Подсказка:
Используйте аннотацию @ValueSource.
 */

public class HotelRoomTest {

    HotelRoom room;


    @BeforeEach
    public void setUp() {
        room = new HotelRoom();

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    void testCalculatePriceShouldReturnPriceForAllNights(int nights) {

        //Act
        int priceResult = room.calculatePrice(nights);
        int expectedPrice = nights * 50;

        //Assert
        assertEquals(expectedPrice, priceResult);

    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -5, 0})
    void testCalculatePriceShouldReturnErrorCodeForAllNights(int nights) {

        //Act
        int priceResult = room.calculatePrice(nights);

        //Assert
        assertEquals(-1, priceResult);

    }
}
