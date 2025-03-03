package de.ait.lessons.oldlessons.lesson14;

import java.util.ArrayList;
import java.util.Iterator;
/*
Удаление книги по названию

1.  Создайте список для хранения названий книг.
2.  Добавьте в список несколько книг.
3.  Удалите книгу по названию
4.  Выведите список после удаления.
 */

public class Task01_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");

        for (String book : books) {
            System.out.println(book);
        }

        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String booksInList = iterator.next();
            if (booksInList.equals("Book 3")) {
                iterator.remove();
            }
            System.out.println(books);
            }
        }
    }
