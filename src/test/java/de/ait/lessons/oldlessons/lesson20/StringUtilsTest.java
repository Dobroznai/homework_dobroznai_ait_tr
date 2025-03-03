package de.ait.lessons.oldlessons.lesson20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenBothNullAndEmpty() {

        //Arrange
        StringUtils stringUtils = new StringUtils();

        //Act
        String result = stringUtils.cocatenate("Hello", "World");

        //Assert
        assertEquals("HelloWorld", result);
        assertEquals(10, result.length());
    }

    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenSecondStringsIsNull() {
        //Arrange
        StringUtils stringUtils = new StringUtils();

        //Act
        String result = stringUtils.cocatenate("Hello", null);

        //Assert
        assertEquals("Hello", result);
    }

    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenFirstStringIsNull() {
        //Arrange
        StringUtils stringUtils = new StringUtils();

        //Act
        String result = stringUtils.cocatenate(null, "World");

        //Assert
        assertEquals("World", result);
    }

    @Test
    void testConcatenateShouldReturnConcatenatedStringWhenBothNull() {

        //Arrange
        StringUtils stringUtils = new StringUtils();

        //Act
        String result = stringUtils.cocatenate(null, null);

        //Assert
        assertEquals("", result);
    }
}
