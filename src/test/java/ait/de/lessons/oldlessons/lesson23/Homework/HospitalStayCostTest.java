package ait.de.lessons.oldlessons.lesson23.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalStayCostTest {


    @ParameterizedTest
    @CsvSource({"1, 100",  // 1 день - 100 евро
            "2, 180",  // 1 день 100 евро + 80 евро
            "5, 420",  // 1 день 100 евро + 4*80 евро
            "0, -1",   // Некорректное количество дней
            "-1, -1"   // Некорректное количество дней
    })
    void testCalculatedHospitalStayCostShouldReturnSummaryCost(int days, int expectedSummary) {

        //Arrange
        HospitalStayCost cost = new HospitalStayCost();

        //Act
        int result = cost.calculateHospitalStayCost(days);

        //Assert
        assertEquals(expectedSummary, result, "The calculated hospital stay cost is incorrect.");

    }
}
