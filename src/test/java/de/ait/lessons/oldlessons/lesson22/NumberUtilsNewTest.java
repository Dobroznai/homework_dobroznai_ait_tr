package de.ait.lessons.oldlessons.lesson22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsNewTest {

    private NumberUtilsNew numberUtils;

    @BeforeEach
    public void setup() {
        numberUtils = new NumberUtilsNew();
    }
    @ParameterizedTest
    @ValueSource(ints = {4,6,8,10,12,14})
    void testIsEvenShouldReturnTrueForEventsNumbers(int number) {
        boolean evenResult = numberUtils.isEven(number);
        assertTrue(evenResult, number + " must be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {5,7,9,11,13,15})
    void testIsEvenShouldReturnFalseForEventsNumbers(int number) {
        boolean evenResult = numberUtils.isEven(number);
        assertFalse(evenResult, number + " must be not even");
    }
}
