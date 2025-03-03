package de.ait.lessons.oldlessons.lesson06;

public class LogicalOperators1 {

    public static void main(String[] args) {
        int age = 17; // Возраст пользователя / User's age
        boolean hasTicket = false; // Есть ли у пользователя билет / Does the user have a ticket

        // Проверка условий / Checking conditions
        // Если возраст больше или равен 18 и у пользователя есть билет, то /
        // If the age is 18 or older and the user has a ticket, then
        if(age >= 18 && hasTicket == true) { // true && true  --> true
            System.out.println("Welcome !!!"); // Пользователь допускается к входу / User is allowed to enter
        }
        else {
            // Если одно из условий не выполнено / If one of the conditions is not met
            System.out.println("You are not allowed to enter !!!"); // Пользователь не допускается к входу / User is not allowed to enter
        }
    }
}
