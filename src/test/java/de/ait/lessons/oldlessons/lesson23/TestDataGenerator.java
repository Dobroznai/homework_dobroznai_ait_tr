package de.ait.lessons.oldlessons.lesson23;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataGenerator {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.GERMAN);
        for (int i = 0; i < 10; i++) {
            //System.out.println(faker.address().fullAddress());
            System.out.println(faker.internet().emailAddress());

        }
    }
}