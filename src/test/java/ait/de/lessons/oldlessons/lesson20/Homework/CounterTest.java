package ait.de.lessons.oldlessons.lesson20.Homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.w3c.dom.css.Counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Упражнение 2: Тестирование Класса Счётчик

Задание: • Реализуйте класс Counter с методами increment(), decrement() и int getValue().
• Напишите тесты, которые проверяют корректность увеличения и уменьшения значения счётчика.
Цель: • Практика тестирования изменения состояния объекта.
• Использование методов @BeforeEach для настройки перед каждым тестом.
 */
public class CounterTest {

    // Поле для обьекта Counter который будет тестироваться
    private Counter counter;

    // Выполняется один раз перед всеми тестами
    @BeforeAll
    static void setUpAll() {
        System.out.println("setUpAll");
    }

    //* Выполняется перед каждым тестом для инициализации объекта.
    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
        counter = new Counter();
    }

    // Выполняется после каждого теста для освобождения ресурсов.
    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll");
    }

    //Тестирует метод increment, проверяя увеличение значения счётчика на 1.

    @Test
    @DisplayName("Тест инкрементации увеличиваем счетчик на 1")
        //Указывает название теста, которое будет отображаться в отчётах.
        // @Disabled("Рефакторинг кода #1234") // Отключает тест, например, во время рефакторинга.
    void testInctestIncrementShouldIncrementCounterValueByOnerement() {
        // Act
        counter.increment();
        //Assert
        assertEquals(1, counter.getValue());
    }

    @Test
    @Timeout(2) // Устанавливает ограничение по времени на выполнение теста.
    @Order(2)
        // Указывает порядок выполнения теста.
    void testDecrementShouldDecrementCounterValueByOne() {

        // Act: Уменьшаем значение счётчика на 1.
        counter.decrement();

        int value = counter.getValue();

        // Assert: Проверяем, что значение счётчика равно -1.
        assertEquals(-1, value, "Value should be -1");
    }

    //Тестирует комбинацию инкрементации и декрементации, проверяя, что итоговое значение счётчика остаётся 0.

    @Test
    // @RepeatedTest(3) // Повторяет тест 3 раза.
    @Order(1)
        // Указывает порядок выполнения теста.
    void testShouldDecrementIncrementCounterValueTwoOperations() {

        // Act: Выполняем инкрементацию и декрементацию.
        counter.increment();
        counter.decrement();

        int value = counter.getValue();

        // Assert: Проверяем, что значение счётчика равно 0.
        assertEquals(0, value, "Value should be 0");
    }
}