package de.ait.lessons.oldlessons.lesson23;

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

public class ValidDataGuest {

    public boolean isValidGuestData(String name, int age) {
        if (name == null || name.trim().isEmpty() || name.equals("null")) {
            return false;
        }
        if (age >= 18 && age <= 100) {
            return true;
        }
        return false;
    }
}
