package de.ait.lessons.oldlessons.lesson10;
import java.util.Scanner;
public class newStrings {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String halloween = "Merry Christmas!";


            //получить длину строки
            int length = halloween.length();
            System.out.println("length " + length);

            //конкатенация (слияние) строк
            String year = "2024";
            String halloween3 = halloween.concat(" " + year);
            System.out.println(halloween3);

            //сравнение строк year Year
            System.out.println("year Year equals " + "Year".equals("year"));
            System.out.println("year Year equalsIgnoreCase " + "Year".equalsIgnoreCase("year"));

            //получение знака по индексу
            char c = halloween.charAt(0);
            System.out.println("charAt(0) = " + c);

            //Замена символов или подстрок
            String replaceResult = halloween.replace("Merry", "Happy");
            System.out.println(replaceResult);

            //Преобразование регистра (шрифта)
            String happy = "HAPPY";
            String java = "java";
            String lowerHappy = happy.toLowerCase();
            String upperJava = java.toUpperCase();
            System.out.println(lowerHappy);
            System.out.println(upperJava);

            //Удаление пробелов
            String city = "       Berlin                 ";
            String cotyTrim = city.trim();
            System.out.println("city length " + city.length());
            System.out.println("cotyTrim length" + cotyTrim.length());

            // Преобразование с символа в строку
            System.out.println("Enter animal: ");
            String animal = scanner.nextLine();
            char ch = animal.charAt(0); // Получаем символ
            String str = String.valueOf(ch); // Преобразуем символ в строку

            String result = switch (str) {
                case "k" -> "This animal is wild";
                case "t" -> "This is a pet";
                default -> "This is an unknown animal";
            };
            System.out.println(result);
            scanner.close();

        }
    }