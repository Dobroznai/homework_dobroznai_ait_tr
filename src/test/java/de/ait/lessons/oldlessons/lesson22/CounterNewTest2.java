package de.ait.lessons.oldlessons.lesson22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterNewTest2 {

    private CounterNew counter;

    @BeforeEach
    public void setup() {
        counter = new CounterNew();
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "-1,0"
    })
    void testIncrementShouldIncrementCounterValueNotNull(int initial, int expected) {

        //Arrange
        counter.counterValue   = initial;

        //Act
        counter.increment();

        //Assert
        assertEquals(expected, counter.getValue());
    }


    @ParameterizedTest
    @DisplayName("Test Decrement")
    /*@CsvSource({
            "0,-1",
            "1,0",
            "-1,-2"
    })*/
    @CsvFileSource(resources = "/data/counter.csv")
    void testmDecrementShouldDecrementCounterValueNotNull(int initial, int expected) {

        //Arrange
        counter.counterValue   = initial;

        //Act
        counter.decrement();

        //Assert
        assertEquals(expected, counter.getValue());
    }
}