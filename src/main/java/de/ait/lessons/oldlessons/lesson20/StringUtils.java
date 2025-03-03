package de.ait.lessons.oldlessons.lesson20;

public class StringUtils {
    /*
    Создайте класс StringUtils с методом String concatenate(String a, String b), который объединяет две строки.
	•	Напишите unit-тесты для метода concatenate, проверяя корректность работы с различными строками
	(пустые строки, null, обычные строки).
     */
    public String cocatenate(String a, String b) {
        if (a == null) {
            a = "";
        }
        if (b == null) {
            b = "";
        }
        return a + b;
    }
}
