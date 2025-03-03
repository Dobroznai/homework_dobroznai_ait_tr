package de.ait.lessons.oldlessons.lesson22.Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCostCalculatorTest {

    private ShippingCostCalculator calculator;

    @BeforeEach
    public void setUp() {

        //Arrange
        calculator = new ShippingCostCalculator();
    }

    @ParameterizedTest
    @CsvSource({
            "4.1, 10.0", // Вес меньше 5 кг
            "5.0, 10.0", // Граничное значение 5 кг
            "10.0, 20.0",  // Вес в диапазоне от 5 до 20 кг
            "20.0, 20.0",  // Граничное значение 20 кг
            "25.0, 50.0"   // Вес более 20 кг
    })
    public void testCalculateShippingCost(double initialWeight, double expectedShippingCost) {

        //Act

        double actualCost = calculator.calculateShippingCost(initialWeight);

        //Assert

        assertEquals(expectedShippingCost, actualCost, "Стоимость доставки для веса " + initialWeight + " должна быть " + expectedShippingCost);

    }
}
