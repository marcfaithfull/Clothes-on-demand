package org.example.menu;

import org.example.CEO;
import org.example.Customer;
import org.example.clothing.ClothesModifier;
import org.example.clothing.tshirt.TShirt;
import org.example.clothing.tshirt.TShirtBuilder;
import org.example.clothing.tshirt.command.TShirtSetNeckToRegular;
import org.example.clothing.tshirt.command.TShirtSetNeckToVNeck;
import org.example.clothing.tshirt.command.TShirtSetSleevesToLong;
import org.example.clothing.tshirt.command.TShirtSetSleevesToShort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TShirtMenu {

    public static void buildTShirt(Customer customer, Scanner scanner, ClothesModifier clothesModifier) {
        TShirtBuilder tshirtBuilder = new TShirtBuilder();
        tshirtBuilder.addObserver(CEO.getCEO());
        TShirt tShirt = tshirtBuilder
                .size(SizeMenu.chooseSize(scanner))
                .material(MaterialMenu.chooseMaterial(scanner))
                .colour(ColourMenu.chooseColour(scanner))
                .build();

        TShirtMenu.chooseSleeves(scanner, tShirt, clothesModifier);
        TShirtMenu.chooseNeck(scanner, tShirt, clothesModifier);

        customer.addItemToBasket(tShirt);
    }

    public static void chooseSleeves(Scanner scanner, TShirt tShirt, ClothesModifier clothesModifier) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose sleeves");
                System.out.println("1) Short");
                System.out.println("2) Long");
                System.out.print("Option: ");

                int SleeveChoice = scanner.nextInt();
                switch (SleeveChoice) {
                    case 1:
                        TShirtSetSleevesToShort tShirtSetSleevesToShort = new TShirtSetSleevesToShort(tShirt);
                        clothesModifier.addClothesModification(tShirtSetSleevesToShort);
                        return;
                    case 2:
                        TShirtSetSleevesToLong tShirtSetSleevesToLong = new TShirtSetSleevesToLong(tShirt);
                        clothesModifier.addClothesModification(tShirtSetSleevesToLong);
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

    public static void chooseNeck(Scanner scanner, TShirt tShirt, ClothesModifier clothesModifier) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your neck");
                System.out.println("1) Regular");
                System.out.println("2) V-Neck");
                System.out.print("Option: ");

                int NeckChoice = scanner.nextInt();
                switch (NeckChoice) {
                    case 1:
                        TShirtSetNeckToRegular tShirtSetNeckToRegular = new TShirtSetNeckToRegular(tShirt);
                        clothesModifier.addClothesModification(tShirtSetNeckToRegular);
                        clothesModifier.confirm();
                        return;
                    case 2:
                        TShirtSetNeckToVNeck tShirtSetNeckToVNeck = new TShirtSetNeckToVNeck(tShirt);
                        clothesModifier.addClothesModification(tShirtSetNeckToVNeck);
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
