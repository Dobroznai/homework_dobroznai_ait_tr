package de.ait.lessons.oldlessons.lesson15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PetShop {


        // Создание объекта Scanner для чтения ввода пользователя
        // Creating a Scanner object to read user input
        static Scanner scanner = new Scanner(System.in);

        // Создание списка для хранения товаров
        // Creating a list to store products
        static ArrayList<String> products = new ArrayList<>();

        public static void main(String[] args) {
            // Управляющая переменная для основного цикла программы
            // Control variable for the main program loop
            boolean running = true;

            // Основной цикл программы, который отображает меню и обрабатывает выбор пользователя
            // Main loop of the program that displays the menu and processes user choices
            while (running) {
                showMenu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> addProduct();
                    case 2 -> removeProduct();
                    case 3 -> searchProduct();
                    case 4 -> updateProduct();
                    case 5 -> sortProducts();
                    case 6 -> showProducts();
                    case 7 -> clearProducts();
                    case 8 -> {
                        // Завершение программы
                        // Exiting the program
                        System.out.println("Программа завершена.");
                        scanner.close();
                        running = false;
                    }
                    default -> System.err.println("Неверный ввод, попробуйте снова."); // Обработка неверного ввода
                }
            }
        }

        // Метод для отображения меню
        // Method to display the menu
        private static void showMenu() {
            System.out.println("\n--- 😻  Меню управления зоомагазином 😼 ---");
            System.out.println("1. Добавить товар");
            System.out.println("2. Удалить товар");
            System.out.println("3. Найти товар");
            System.out.println("4. Обновить товар");
            System.out.println("5. Отсортировать товары");
            System.out.println("6. Показать список товаров");
            System.out.println("7. Очистить список товаров");
            System.out.println("8. Выйти");
            System.out.print("Выберите действие: ");
        }

        // Метод для добавления нового товара
        // Method to add a new product
        private static void addProduct() {
            scanner.nextLine(); // Очистка ввода
            System.out.print("Введите название товара: ");
            String productName = scanner.nextLine();
            products.add(productName); // Добавление товара в список
            System.out.println("Товар добавлен.");
        }

        // Метод для удаления товара
        // Method to remove a product
        private static void removeProduct() {
            scanner.nextLine(); // Очистка ввода
            System.out.print("Введите название товара для удаления: ");
            String productNameToRemove = scanner.nextLine().trim();
            // Проверка, содержит ли список указанный товар
            // Check if the list contains the specified product
            if (products.contains(productNameToRemove)) {
                Iterator<String> iterator = products.iterator();
                while (iterator.hasNext()) {
                    String product = iterator.next();
                    if (product.equals(productNameToRemove)) {
                        iterator.remove(); // Удаление с помощью итератора // Remove using the iterator
                    }
                }
                System.out.println("Товар удален.");
            } else {
                System.out.println("Товар " + productNameToRemove + " не найден");
            }
        }

        // Метод для поиска товара
        // Method to search for a product
        private static void searchProduct() {
            scanner.nextLine(); // Очистка ввода
            System.out.print("Введите название товара для поиска: ");
            String productToSearch = scanner.nextLine().trim();
            // Проверка наличия товара в списке и вывод результата
            // Check if the product is in the list and display the result
            if (products.contains(productToSearch)) {
                System.out.println("Товар найден: " + productToSearch);
            } else {
                System.out.println("Товар не найден.");
            }
        }

        // Метод для обновления названия товара
        // Method to update the name of a product
        private static void updateProduct() {
            scanner.nextLine(); // Очистка ввода
            System.out.print("Введите название товара для обновления: ");
            String productNameToUpdate = scanner.nextLine().trim();
            // Проверка наличия товара в списке
            // Check if the product is in the list
            if (!products.contains(productNameToUpdate)) {
                System.out.println("Товар " + productNameToUpdate + " не найден");
            } else {
                System.out.print("Введите новое название: ");
                String newProductName = scanner.nextLine().trim();
                int index = products.indexOf(productNameToUpdate); // Получение индекса товара
                products.set(index, newProductName); // Обновление товара по индексу
                System.out.println("Товар обновлен.");
            }
        }

        // Метод для сортировки списка товаров по алфавиту
        // Method to sort the product list alphabetically
        private static void sortProducts() {
            Collections.sort(products);
            System.out.println("Список товаров отсортирован.");
        }

        // Метод для отображения всех товаров
        // Method to display all products
        private static void showProducts() {
            if (products.isEmpty()) {
                System.out.println("Список товаров пуст.");
            } else {
                System.out.println("Список товаров:");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println((i + 1) + ". " + products.get(i)); // Вывод каждого товара с номером
                }
            }
        }

        // Метод для очистки списка товаров
        // Method to clear the product list
        private static void clearProducts() {
            products.clear(); // Очистка списка
            System.out.println("Список товаров очищен.");
        }
    }
