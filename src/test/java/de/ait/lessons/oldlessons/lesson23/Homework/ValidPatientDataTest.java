package de.ait.lessons.oldlessons.lesson23.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPatientDataTest {

    @ParameterizedTest
    @CsvSource({
            "John, 30, Flu, true",        // Валидные данные
            "'', 30, Flu, false",         // Пустое имя
            "John, -1, Flu, false",       // Некорректный возраст
            "John, 30, '', false",        // Пустой диагноз
            "null, 50, Flu, false",       // null в имени
            "Alice, 130, Covid, false",   // Возраст вне диапазона
            " , 100, Flu, false",         // Пустое имя (пробелы)
            "John, 100, null, false",     // null в диагнозе
            "John, 0, Flu, false",        // Возраст на границе диапазона
            "John, 120, Flu, true"        // Валидный возраст на верхней границе
    })
    void testValidPatientDataShouldNotEmptyNotNullAndAgeInRangeZeroToOneHundredTwentyYears(String name, int age, String diagnosis, boolean expected) {

        //Arrange
        ValidPatientData data = new ValidPatientData();

        //Act
        boolean result = data.isValidPatientData(name, age, diagnosis);

        //Assert
        assertEquals(expected, result, "The data hospital is incorrect.");

    }
}
