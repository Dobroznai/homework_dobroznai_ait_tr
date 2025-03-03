package ait.de.lessons.oldlessons.lesson23;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidMailTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data/ListMail.csv", numLinesToSkip = 1)
    void testIsValidMailShouldReturnAllResults(String email, boolean expected) {

        //Arrange
        ValidMail validMail = new ValidMail();

        //Act
        boolean result = validMail.isEmailValid(email);

        //Assert
        assertEquals(expected, result);
    }
}
