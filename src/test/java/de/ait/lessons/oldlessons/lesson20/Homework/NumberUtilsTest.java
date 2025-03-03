package de.ait.lessons.oldlessons.lesson20.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
Тестирование Метода Определения Четности Числа

Задание: • Создайте класс NumberUtils с методом boolean isEven(int number), который возвращает true, если число чётное.
• Напишите тесты для проверки метода isEven с разными числами (чётными и нечётными).
Цель: • Практика написания тестов с булевыми результатами.
• Использование assertTrue и assertFalse.
 */
public class NumberUtilsTest {


    @Test
    void testIsEvenShouldReturnTrueWhenIsEvenNumber() {
        // Arrange
        NumberUtils numberUtils = new NumberUtils();
        int evenNumberTest = 4;

        //Act
        boolean result = numberUtils.isEven(evenNumberTest);

        //Assert
        assertTrue(result, "Number 4 should be even");
    }

    @Test
    void testIsEvenShouldReturnTrueWhenIsNotEvenNumber() {
        // Arrange
        NumberUtils numberUtils = new NumberUtils();
        int evenNumberTest = 3;

        //Act
        boolean result = numberUtils.isEven(evenNumberTest);

        //Assert
        assertFalse(result, "Number 3 should not be even");
    }
}
