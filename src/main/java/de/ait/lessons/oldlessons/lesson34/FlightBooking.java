package de.ait.lessons.oldlessons.lesson34;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightBooking {

    public void bookFlight(String flightNumber, String passengerName, int seatNumber) {

        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Некорректный номер рейса");


        }
        if (passengerName == null || passengerName.isEmpty()) {
            throw new IllegalArgumentException("Некорректное имя пассажира");
        }

        if (seatNumber <= 0) {
            throw new IllegalArgumentException("Некорректный номер места");
        }

        System.out.println("Рейс " + flightNumber + " успешно забронирован для пассажира " + passengerName + " на место " + seatNumber);
    }

    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();

        try {
            // корректные данные
            booking.bookFlight("001f", "Иван Иванов", 15);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            // некорректный номер рейса
            booking.bookFlight("", "Olgв", 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            // пустое имя пассажира
            booking.bookFlight("002f", "", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            // неправильный номер места
            booking.bookFlight("003f", "Andrey", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}