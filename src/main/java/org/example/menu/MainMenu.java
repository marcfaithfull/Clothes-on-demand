package org.example.menu;

import org.example.Customer;

public class MainMenu {

    public static void loadWelcomeMenu() {
        System.out.println("Welcome to CLOTHES ON DEMAND");
        System.out.print("Please Enter your name to continue: ");
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
}