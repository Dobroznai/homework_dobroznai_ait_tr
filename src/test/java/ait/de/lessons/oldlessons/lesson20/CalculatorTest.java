package ait.de.lessons.oldlessons.lesson20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(1, 2);

        assertEquals (3, result, "really?");
    }
}
