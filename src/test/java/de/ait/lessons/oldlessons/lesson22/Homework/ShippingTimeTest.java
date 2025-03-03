package de.ait.lessons.oldlessons.lesson22.Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingTimeTest {

    private ShippingTime shippingTime;

    @BeforeEach
    public void setup() {
        shippingTime = new ShippingTime();
    }

    @ParameterizedTest
    @CsvSource ({
            "45.5, 1",
            "450.0, 3",
            "500.0, 3",
            "550, 7"
    })

    public void testCalculatedDeliveryTime(double deliveryTime, int expectedDeliveryTime) {

        //Act
        int actualDeliveryTime = shippingTime.calculateDeliveryTime(deliveryTime);

        //Assert
        assertEquals(expectedDeliveryTime, actualDeliveryTime, "Время доставки " + deliveryTime + " должно быть " + expectedDeliveryTime);
    }
}
