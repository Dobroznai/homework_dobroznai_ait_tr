package ait.de.lessons.oldlessons.lesson14;

import java.util.ArrayList;

/*
Поиск книги в списке

1.  Создайте список для хранения названий книг.
2.  Добавьте несколько книг в список.
3.  Проверьте, содержится ли определённая книга в списке
4.  Выведите результат поиска.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Harry Potter");
        books.add("Sherlock Holmes");
        books.add("Alice in Wonderland");
        System.out.println(books);

        String searchBook = "Alice in Wonderland";
        if (books.contains(searchBook)) {
            System.out.println("Book " + searchBook + " was delayed");
        }
    }
}
