package ait.de.lessons.oldlessons.lesson23.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssingRoomTest {

    @ParameterizedTest
    @CsvSource({
            "John, Critical, ICU",          // Критическое состояние
            "Alice, Infectious, Isolation", // Инфекционное заболевание
            "Bob, General, General",        // Некритическое состояние
            "Emma, null, General",          // Отсутствие диагноза — General
            "'', General, General",          // Отсутствие имени игнорируется, палата General
            " , , General",
            " , General, General",
            "Ivan, '',General",
            "Ivan, Light, General",
            "null, General, General",
            "'', '', General"
    })
    void testAssingRoomShouldReturnTheNameDependingOnThePatientsDiagnosis(String patientName, String condition, String expectedRoom) {

        //Assert
        AssingRoom room = new AssingRoom();

        //Act
        String result = room.assignRoom(patientName, condition);

        //Assert
        assertEquals(expectedRoom, result, "The Assign Room is Incorrect");

    }
}
