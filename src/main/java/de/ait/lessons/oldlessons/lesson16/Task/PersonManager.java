package de.ait.lessons.oldlessons.lesson16.Task;

public class PersonManager {
    public static void main(String[] args) {
        Person personOne = new Person("Trump", 78);
        Person personTwo = new Person("Kamala", 67);

        personOne.displayInfo();
        personTwo.displayInfo();

        personOne.age=79;
        personOne.displayInfo();
    }
}
