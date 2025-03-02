package org.example.page.productpages;

import org.example.Customer;

public class ProductPage {

    public static void loadProductPage(Customer customer) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("What product are you interested in " + customer.getName() + "?");
        System.out.println("1) T-Shirts");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4) Close program");
        System.out.print("Option: ");
    }

    public static void loadErrorMessage() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Please enter a valid option!");
    }
}