package org.example;

import org.example.clothing.ClothesModifier;
import org.example.clothing.ItemOfClothing;
import org.example.clothing.pants.*;
import org.example.clothing.skirt.Skirt;
import org.example.clothing.tshirt.TShirt;
import org.example.menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pants pants = null;
        TShirt tShirt = null;
        Skirt skirt = null;
        ClothesModifier clothesModifier = new ClothesModifier();

        List<ItemOfClothing> basket = new ArrayList<>();

        MainMenu.loadWelcomeMenu();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Customer customer = new Customer(name);

        while (true) {
            MainMenu.loadProductMenu(customer);
            if (!scanner.hasNextInt()) {
                MainMenu.loadErrorMessage();
                scanner.next();
                continue;
            }
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    pants = new Pants.PantsBuilder()
                            .size(SizeMenu.chooseSize(scanner))
                            .material(MaterialMenu.chooseMaterial(scanner))
                            .colour(ColourMenu.chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Build method complete");

                    PantsMenu.chooseFit(scanner, pants, clothesModifier);
                    PantsMenu.chooseLength(scanner, pants, clothesModifier);

                    System.out.println("Would you like to add this to your basket?");
                    basket.add(pants);

                    // Inform CEO that an order is in place
                    // Place order?
                    // Send receipt
                    break;

                case 2:
                    tShirt = new TShirt.TShirtBuilder()
                            .size(SizeMenu.chooseSize(scanner))
                            .material(MaterialMenu.chooseMaterial(scanner))
                            .colour(ColourMenu.chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Build method complete");

                    TShirtMenu.chooseSleeves(scanner, tShirt, clothesModifier);
                    TShirtMenu.chooseNeck(scanner, tShirt, clothesModifier);
                    basket.add(tShirt);
                    break;

                case 3:
                    skirt = new Skirt.SkirtBuilder()
                            .size(SizeMenu.chooseSize(scanner))
                            .material(MaterialMenu.chooseMaterial(scanner))
                            .colour(ColourMenu.chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Build method complete");

                    SkirtMenu.chooseWaistline(scanner, skirt, clothesModifier);
                    SkirtMenu.choosePattern(scanner, skirt, clothesModifier);
                    basket.add(skirt);
                    break;

                default:
                    MainMenu.loadErrorMessage();
                    continue;
            }
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(pants);
            System.out.println(tShirt);
            System.out.println(skirt);
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Happy happy");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(basket);
        }
    }
}