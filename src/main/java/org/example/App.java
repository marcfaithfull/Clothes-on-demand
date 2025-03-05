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
        //Pants pants = null;
        TShirt tShirt = null;
        Skirt skirt = null;
        ClothesModifier clothesModifier = new ClothesModifier();
        List<ItemOfClothing> basket = new ArrayList<>();

        MainMenu.loadWelcomeMenu();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Customer customer = new Customer(name);

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
                    PantsMenu.buildPants(scanner, clothesModifier, basket);
                    break;
                case 2:
                    TShirtMenu.buildTShirt(scanner, clothesModifier, basket);
                    break;
                case 3:
                    SkirtMenu.buildSkirt(scanner, clothesModifier, basket);
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
