package ait.de.lessons.oldlessons.lesson04;

public class JavaOperatorsTask18 {
    // програма доступа к сайту на основе возраста пользователя и наличия учетной записи

    static int age = 18;
    static boolean isRegistered = true;

    static int userAge = 26; // Возраст пользователя / User's age
    static boolean isUserRegistered = false; // Статус регистрации пользователя / User's registration status
    static int minAge = 18; // Минимальный возраст для доступа / Minimum age for access

    public static void main(String[] args) {
        System.out.println("***VARIANT 1******");
        if (age >= 18 & isRegistered) {
            System.out.println("Age: " + age);
            System.out.println("Acces Allowed");
        } else {
            System.out.println("Age: " + age);
            System.out.println("Acces Denied");
        }
        // variant 2

        // Реализуйте программу, которая проверяет, может ли пользователь
        // получить доступ к сайту на основе его возраста и наличия учётной записи.
        // Implement a program that checks if a user can access a website
        // based on their age and account registration status.

        // x.equals(y) — сравнение строк / string comparison

        // Age passed  Registration passed Result
        // true true  --> true
        // true false --> false
        // false true --> false
        // false false --> false

        System.out.println("******VARIANT 2********");
        if (userAge >= minAge) { // Проверка возраста пользователя / Checking user's age
            System.out.println("Age check passed"); // Возрастное ограничение пройдено / Age check passed
            if (isUserRegistered) { // Проверка регистрации пользователя / Checking if user is registered
                System.out.println("Welcome !!!"); // Пользователь получает доступ / User is granted access
            } else {
                System.out.println("You must be registered"); // Пользователь должен зарегистрироваться / User must be registered
            }
        } else {
            System.out.println("You are too young"); // Возраст пользователя слишком мал для доступа / User is too young for access
        }
    }
}

