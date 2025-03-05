package org.example;

import org.example.clothing.ClothesModifier;
import org.example.menu.MainMenu;
import org.example.menu.PantsMenu;
import org.example.menu.SkirtMenu;
import org.example.menu.TShirtMenu;

import java.util.Scanner;

public class ClothesOnDemand {

    public static void loadProgram(Customer customer, Scanner scanner, ClothesModifier clothesModifier) {
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
                programIsActive = false;
            }
        }
    }
}
