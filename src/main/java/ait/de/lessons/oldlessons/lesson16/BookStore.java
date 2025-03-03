package ait.de.lessons.oldlessons.lesson16;

import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        // Создание объекта Book с использованием конструктора, который принимает все параметры
        // Creating a Book object using the constructor that accepts all parameters
        Book bookProgramming = new Book("Java First", "Schild", 550);
        //System.out.println(bookProgramming); // Можно использовать для вывода информации о книге

        // Создание объекта Book с использованием конструктора по умолчанию
        // Creating a Book object using the default constructor
        Book book = new Book();
        //System.out.println(book); // Можно использовать для вывода информации о книге

        // Создание объекта Book с использованием конструктора, принимающего название и автора
        // Creating a Book object using the constructor that accepts title and author
        Book bookHarryPotter = new Book("Harry Potter", "J.K. Rowling");
        //System.out.println(bookHarryPotter); // Можно использовать для вывода информации о книге

        // Создание ArrayList для хранения объектов Book
        // Creating an ArrayList to store Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Добавление книг в список
        // Adding books to the list
        books.add(book); // Книга, созданная конструктором по умолчанию
        // Book created with the default constructor
        books.add(bookHarryPotter); // Книга, созданная конструктором с двумя параметрами
        // Book created with the constructor with two parameters
        books.add(bookProgramming); // Книга, созданная конструктором с тремя параметрами
        // Book created with the constructor with three parameters

        // Цикл для вывода количества страниц у каждой книги в списке
        // Loop to print the number of pages of each book in the list
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).pages); // Получение и вывод значения поля pages
            // Accessing and printing the value of the pages field
        }
    }
}