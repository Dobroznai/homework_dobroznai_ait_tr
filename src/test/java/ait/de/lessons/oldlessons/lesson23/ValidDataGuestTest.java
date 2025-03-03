package ait.de.lessons.oldlessons.lesson23;

/*
Задание 2: Валидация данных гостей
Описание:
Метод isValidGuestData(String name, int age) проверяет, что имя гостя не пустое,
а возраст находится в диапазоне от 18 до 100 лет.
Требуется:
Написать параметризованный тест, который проверяет метод на различных наборах данных:
•	“Alice”, 25 (валидные данные)
•	“”, 30 (невалидное имя)
•	“Bob”, 17 (возраст меньше 18)
•	“Charlie”, 101 (возраст больше 100)
Подсказка:
Используйте аннотацию @CsvSource.
*/

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidDataGuestTest {

    @ParameterizedTest
    @CsvSource({
            "Alice,25,true",
            " ,30,false",
            "Bob,17,false",
            "Charlie,101,false",
            "'',20,false",
            "null,30,false"
    })
    void testIsValidDataGuestShouldNotEmptyAndAgeInRange18to100Years(String name, int age, boolean expected) {

        //Arrange

        ValidDataGuest validDataGuest = new ValidDataGuest();

        //Act

        boolean result = validDataGuest.isValidGuestData(name, age);

        //Assert
        assertEquals(result, expected);

    }
}
