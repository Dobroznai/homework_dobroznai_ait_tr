package ait.de.lessons.oldlessons.lesson22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterNewTest {

    private CounterNew counter;

    @BeforeEach
    public void setup() {
        counter = new CounterNew();
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "-1,1"
    })
    void testIncrement(int initial, int expected) {
        for (int i = 0; i < initial; i++) {
            counter.increment();
        }
        counter.increment();
        assertEquals(expected, counter.getValue());


    }
}