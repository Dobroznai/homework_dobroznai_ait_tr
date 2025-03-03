package de.ait.lessons.oldlessons.lesson16.Task02.Book;

import java.util.ArrayList;

public class BookManager {
    public static void main(String[] args) {
        Book book = new Book();
        //System.out.println(book);

        Book bookHarryPotter = new Book("Harry Potter", "Rowling");
        //System.out.println(bookHarryPotter);

        Book bookProgram = new Book("jjjj", "jlksj", 150);
        //System.out.println(bookProgram);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(bookProgram);
        books.add(bookHarryPotter);

        for (int i=0; i<books.size(); i++) {
            System.out.println(books.get(i).pages);
        }
    }
}
