package de.ait.homework33;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Scanner;

@Slf4j
public class GiftApp {

    private static Scanner sc = new Scanner(System.in);

    private static GiftManager giftManager = new GiftManager();


    public static void main(String[] args) {
        boolean running = true;
        showMenu();
        while (running) {
            System.out.print("Choose an action: ");
            String userChoice = sc.nextLine();

            switch (userChoice) {
                case "1":
                    addGift();
                    break;
                case "2":
                    showGifts();
                    break;
                case "3":
                    filterGiftsByCategory();
                    break;
                case "4":
                    updateGiftStatus();
                    break;
                case "5":
                    System.out.println("Exiting the program. Thank you for using the Gift Management System!");
                    running = false;
                    sc.close();
                    break;
                default:
                    showMenu();

            }

        }
    }

    private static void updateGiftStatus() {
        System.out.println("Enter the gift name to update its status:  ");

        String giftName = sc.nextLine().trim();

        System.out.print("Select the new status (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED): ");
        String newStatus = sc.nextLine().trim();

        boolean statusUpdated = giftManager.updateGiftStatus(giftName, GiftStatus.valueOf(newStatus));

        if (statusUpdated) {
            System.out.println("Gift status update successfully");
            log.info("Status of gift " + giftName + " was updated to " + newStatus);
        } else {

        }

    }

    private static void filterGiftsByCategory() {
        System.out.println("Enter the category (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES): ");
        String category = sc.nextLine().trim();
        List<Gift> filteredGifts = giftManager.filterByCategory(GiftCategory.valueOf(category));
    }


    private static void showGifts() {
        List<Gift> giftsToShow = giftManager.getGifts();
        if (giftsToShow.isEmpty()) {
            System.out.println("No gifts found");
        } else {
            int counter = 1;
            for (Gift gift : giftsToShow) {
                System.out.println(counter + ". " + gift.getName() + ", Category: " + gift.getCategory() + ", Status: " + gift.getStatus());
                counter++;
            }
        }
    }

    private static void addGift() {
        System.out.println("Ente the gift name: ");
        String giftname = sc.nextLine().trim();
        System.out.println("Select the category (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES): ");
        String giftCategory = sc.nextLine().trim();
        System.out.println("Select the status (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED): ");
        String giftStatus = sc.nextLine().trim();

        Gift gift = new Gift(giftname, GiftCategory.valueOf(giftCategory), GiftStatus.valueOf(giftStatus))


    }

    private static void showMenu() {
        System.out.println() "\nWelcome to the Gift Management System!";
        System.out.println("Choose an action:");
        System.out.println("1 - Add a new gift");
        System.out.println("2 - Show all gifts");
        System.out.println("3 - Filter gifts by category");
        System.out.println("4 - Update gift status");
        System.out.println("5 - Exit");
    }
}
