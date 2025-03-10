package org.example.menu;

import org.example.Customer;

import java.util.Scanner;

public class MainMenu {

    public static void loadWelcomeMenu() {
        System.out.println("Welcome to CLOTHES ON DEMAND!");
        System.out.print("All we need is your first name to get started: ");
    }

    public static void loadProductMenu(Customer customer) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("What product are you interested in ordering " + customer.getName() + "?");
        System.out.println("1) Pants");
        System.out.println("2) TShirt");
        System.out.println("3) Skirt");
        System.out.print("Option: ");
    }

    public static void loadErrorMessage() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Please enter a valid option!");
    }

    public static void customerDetails(Customer customer, Scanner scanner) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Perfect! We just need a few more details from you.");

        System.out.print("Your full name: ");
        scanner.nextLine();
        customer.setName(scanner.nextLine());

        System.out.print("Your delivery address: ");
        customer.setAddress(scanner.nextLine());

        System.out.print("Your email address: ");
        customer.setMail(scanner.nextLine());
    }

    public static boolean finaliseOrder(Customer customer, Scanner scanner) {

        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("You've completed all the steps. What would you like to do?");
                System.out.println("1) Continue shopping");
                System.out.println("2) Confirm order");
                System.out.print("Option: ");

                int continueShopping = scanner.nextInt();
                switch (continueShopping) {
                    case 1:
                        return false;
                    case 2:
                        if (customer.getAddress() == null || customer.getMail() == null) {
                            MainMenu.customerDetails(customer, scanner);
                        }
                        return true;
                }
            } catch (Exception e) {
                MainMenu.loadErrorMessage();
            }
        }
    }
}
