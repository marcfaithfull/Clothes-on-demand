package org.example;

import org.example.clothing.ClothesModifier;
import org.example.menu.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        ClothesModifier clothesModifier = new ClothesModifier();
        customer.addObserver(CEO.getCEO());

        MainMenu.loadWelcomeMenu();
        customer.setName(scanner.nextLine());

        boolean programIsActive = true;
        while (programIsActive) {
            MainMenu.loadProductMenu(customer);
            if (!scanner.hasNextInt()) {
                MainMenu.loadErrorMessage();
                scanner.next();
                continue;
            }
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    PantsMenu.buildPants(customer, scanner, clothesModifier);
                    break;
                case 2:
                    TShirtMenu.buildTShirt(customer, scanner, clothesModifier);
                    break;
                case 3:
                    SkirtMenu.buildSkirt(customer, scanner, clothesModifier);
                    break;
                default:
                    MainMenu.loadErrorMessage();
            }
            if (MainMenu.finaliseOrder(customer, scanner)) {
                Order order = new Order(customer);
                order.addObserver(CEO.getCEO());
                Receipt receipt = new Receipt(order);
                receipt.printReceipt(customer);
                order.orderComplete();
                programIsActive = false;
            }
        }
    }
}
