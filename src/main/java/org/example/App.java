package org.example;

import org.example.clothing.ClothesModifier;
import org.example.clothing.ItemOfClothing;
import org.example.clothing.skirt.Skirt;
import org.example.clothing.tshirt.TShirt;
import org.example.menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();
        ClothesModifier clothesModifier = new ClothesModifier();
        Scanner scanner = new Scanner(System.in);

        /*MainMenu.loadWelcomeMenu();
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
        }*/
    }
}
