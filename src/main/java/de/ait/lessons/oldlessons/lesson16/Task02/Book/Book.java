package de.ait.lessons.oldlessons.lesson16.Task02.Book;

public class Book {

    String title;
    String author;
    int pages;



    public Book() {
        this.title = "Неизвестно";
        this.author = "Неизвестно";
        this.pages = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 100;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
