package ait.de.lessons.oldlessons.lesson16;

public class PersonManager {
    public static void main(String[] args) {
        Person personOne = new Person("Doni Trump", 78);
        Person personTwo = new Person("Kamalla Harris", 60);

        personOne.displayInfo();
        personTwo.displayInfo();
    }
}