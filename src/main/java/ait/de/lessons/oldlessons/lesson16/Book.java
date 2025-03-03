package ait.de.lessons.oldlessons.lesson16;

/*
Упражнение 2: Класс с несколькими конструкторами
	1.	Создайте класс Book, который будет представлять книгу.
	2.	Добавьте следующие поля:
	•	String title — название книги.
	•	String author — автор книги.
	•	int pages — количество страниц в книге.
	3.	Создайте три конструктора:
	•	Конструктор по умолчанию, который устанавливает значения полей по умолчанию: title = "Неизвестно", author = "Неизвестен", pages = 0.
	•	Конструктор, который принимает только title и author, и устанавливает pages равным 100.
	•	Конструктор, который принимает все три параметра: title, author, pages.
	4.	В методе main создайте объекты Book с использованием каждого из трех конструкторов и выведите информацию о каждой книге.
 */

public class Book {
    String title;
    String author;
    int pages;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
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
