package de.ait.lessons.timeapi;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeBetwenVisits {
    public static void main(String[] args) {
        LocalDateTime firstVisit = LocalDateTime.of(2025, 1, 15, 9, 00);
        LocalDateTime secondVisit = LocalDateTime.of(2025, 2, 4, 10, 00);

        Duration duration = Duration.between(firstVisit, secondVisit);
        System.out.println("Days between visits " + duration.toDays());
        System.out.printf("Hours between visits " + duration.toHours());

    }
}
