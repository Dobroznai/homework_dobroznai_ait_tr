package ait.de.lessons.oldlessons.lesson22.Homework;

/*
**Задание 2: Проверка зоны доставки**

Задание: Напишите параметризованный тест, который проверяет, обслуживается ли указанная зона доставки.
* Метод public boolean isZoneSupported(String zone) возвращает true, если зона входит в список поддерживаемых.

Поддерживаемые зоны: EU, USA, ASIA.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingZoneTest {

    private ShippingZone shippingZone;

    @BeforeEach
    public void setUp() {
        shippingZone = new ShippingZone();
    }

    @ParameterizedTest
    @CsvSource({
            "EU, true",         // Поддерживаемая зона
            "USA, true",        // Поддерживаемая зона
            "ASIA, true",       // Поддерживаемая зона
            "AFRICA, false",    // Неподдерживаемая зона
            "AUSTRALIA, false", // Неподдерживаемая зона
            "SOUTH_AMERICA, false" // Неподдерживаемая зона
    })
    void testIsZoneSupported(String initialZone, boolean expectedResult) {

        //Act
        boolean actualResult = shippingZone.isZoneSupported(initialZone);

        //Assert
        assertEquals(actualResult, expectedResult, "Зона " + initialZone + " должна возвращать " + expectedResult);
    }
}

