package org.example.menu;

import org.example.CEO;
import org.example.Customer;
import org.example.clothing.ClothesModifier;
import org.example.clothing.skirt.*;
import org.example.clothing.skirt.command.SkirtSetPatternToFlowery;
import org.example.clothing.skirt.command.SkirtSetPatternToPlain;
import org.example.clothing.skirt.command.SkirtSetWaistlineToHigh;
import org.example.clothing.skirt.command.SkirtSetWaistlineToRegular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SkirtMenu {

    public static void buildSkirt(Customer customer, Scanner scanner, ClothesModifier clothesModifier) {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        skirtBuilder.addObserver(CEO.getCEO());
        Skirt skirt = skirtBuilder
                .size(SizeMenu.chooseSize(scanner))
                .material(MaterialMenu.chooseMaterial(scanner))
                .colour(ColourMenu.chooseColour(scanner))
                .build();

        SkirtMenu.chooseWaistline(scanner, skirt, clothesModifier);
        SkirtMenu.choosePattern(scanner, skirt, clothesModifier);

        customer.addItemToBasket(skirt);
    }

    public static void chooseWaistline(Scanner scanner, Skirt skirt, ClothesModifier clothesModifier) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose waistline type");
                System.out.println("1) Regular");
                System.out.println("2) High");
                System.out.print("Option: ");

                int waistlineChoice = scanner.nextInt();
                switch (waistlineChoice) {
                    case 1:
                        SkirtSetWaistlineToRegular skirtSetWaistlineToRegular = new SkirtSetWaistlineToRegular(skirt);
                        clothesModifier.addClothesModification(skirtSetWaistlineToRegular);
                        return;
                    case 2:
                        SkirtSetWaistlineToHigh skirtSetWaistlineToHigh = new SkirtSetWaistlineToHigh(skirt);
                        clothesModifier.addClothesModification(skirtSetWaistlineToHigh);
                        return;
                    default:
                        System.out.println("----------------------------------------------------------------------------------------");
                        System.out.println("Invalid input");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }

    public static void choosePattern(Scanner scanner, Skirt skirt, ClothesModifier clothesModifier) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your length");
                System.out.println("1) Regular");
                System.out.println("2) Flowery");
                System.out.print("Option: ");

                int PatternChoice = scanner.nextInt();
                switch (PatternChoice) {
                    case 1:
                        SkirtSetPatternToPlain skirtSetPatternToPlain = new SkirtSetPatternToPlain(skirt);
                        clothesModifier.addClothesModification(skirtSetPatternToPlain);
                        clothesModifier.confirm();
                        return;
                    case 2:
                        SkirtSetPatternToFlowery skirtSetPatternToFlowery = new SkirtSetPatternToFlowery(skirt);
                        clothesModifier.addClothesModification(skirtSetPatternToFlowery);
                        clothesModifier.confirm();
                        return;
                    default:
                        System.out.println("----------------------------------------------------------------------------------------");
                        System.out.println("Invalid input");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }
}
