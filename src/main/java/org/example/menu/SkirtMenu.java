package org.example.menu;

import org.example.clothing.ClothesModifier;
import org.example.clothing.ItemOfClothing;
import org.example.clothing.skirt.*;
import org.example.clothing.skirt.command.SkirtSetPatternToFlowery;
import org.example.clothing.skirt.command.SkirtSetPatternToPlain;
import org.example.clothing.skirt.command.SkirtSetWaistlineToHigh;
import org.example.clothing.skirt.command.SkirtSetWaistlineToRegular;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SkirtMenu {

    public static void buildSkirt(Scanner scanner, ClothesModifier clothesModifier, List<ItemOfClothing> basket) {
        Skirt skirt = new Skirt.SkirtBuilder()
                .size(SizeMenu.chooseSize(scanner))
                .material(MaterialMenu.chooseMaterial(scanner))
                .colour(ColourMenu.chooseColour(scanner))
                .build();

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Build method complete");

        SkirtMenu.chooseWaistline(scanner, skirt, clothesModifier);
        SkirtMenu.choosePattern(scanner, skirt, clothesModifier);
        basket.add(skirt);
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
                        clothesModifier.setClothesModification(skirtSetWaistlineToRegular);
                        clothesModifier.confirm();
                        return;
                    case 2:
                        SkirtSetWaistlineToHigh skirtSetWaistlineToHigh = new SkirtSetWaistlineToHigh(skirt);
                        clothesModifier.setClothesModification(skirtSetWaistlineToHigh);
                        clothesModifier.confirm();
                        return;
                    default:
                        System.out.println("----------------------------------------------------------------------------------------");
                        System.out.println("Invalid input");
                }
            } catch (InputMismatchException getItRightSon) {
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
                        clothesModifier.setClothesModification(skirtSetPatternToPlain);
                        clothesModifier.confirm();
                        return;
                    case 2:
                        SkirtSetPatternToFlowery skirtSetPatternToFlowery = new SkirtSetPatternToFlowery(skirt);
                        clothesModifier.setClothesModification(skirtSetPatternToFlowery);
                        clothesModifier.confirm();
                        return;
                    default:
                        System.out.println("----------------------------------------------------------------------------------------");
                        System.out.println("Invalid input");
                }
            } catch (InputMismatchException getItRightSon) {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }
}
