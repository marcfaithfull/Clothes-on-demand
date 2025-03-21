package org.example.menu;

import org.example.Customer;
import org.example.clothing.ClothesModifier;
import org.example.clothing.pants.*;
import org.example.clothing.pants.command.PantsSetFitToRegular;
import org.example.clothing.pants.command.PantsSetFitToWide;
import org.example.clothing.pants.command.PantsSetLengthToRegular;
import org.example.clothing.pants.command.PantsSetLengthToShorts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PantsMenu {

    public static void buildPants(Customer customer, Scanner scanner, ClothesModifier clothesModifier) {
        Pants pants = new Pants.PantsBuilder()
                .size(SizeMenu.chooseSize(scanner))
                .material(MaterialMenu.chooseMaterial(scanner))
                .colour(ColourMenu.chooseColour(scanner))
                .build();

        PantsMenu.chooseFit(scanner, pants, clothesModifier);
        PantsMenu.chooseLength(scanner, pants, clothesModifier);

        customer.addItemToBasket(pants);
    }

    public static void chooseFit(Scanner scanner, Pants pants, ClothesModifier clothesModifier) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your fit");
                System.out.println("1) Regular");
                System.out.println("2) Wide");
                System.out.print("Option: ");

                int fitChoice = scanner.nextInt();
                switch (fitChoice) {
                    case 1:
                        PantsSetFitToRegular pantsSetFitToRegular = new PantsSetFitToRegular(pants);
                        clothesModifier.setClothesModification(pantsSetFitToRegular);
                        clothesModifier.confirm();
                        return;
                    case 2:
                        PantsSetFitToWide pantsSetFitToWide = new PantsSetFitToWide(pants);
                        clothesModifier.setClothesModification(pantsSetFitToWide);
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

    public static void chooseLength(Scanner scanner, Pants pants, ClothesModifier clothesModifier) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your length");
                System.out.println("1) Regular");
                System.out.println("2) Shorts");
                System.out.print("Option: ");

                int lengthChoice = scanner.nextInt();
                switch (lengthChoice) {
                    case 1:
                        PantsSetLengthToRegular pantsSetLengthToRegular = new PantsSetLengthToRegular(pants);
                        clothesModifier.setClothesModification(pantsSetLengthToRegular);
                        clothesModifier.confirm();
                        return;
                    case 2:
                        PantsSetLengthToShorts pantsSetLengthToShorts = new PantsSetLengthToShorts(pants);
                        clothesModifier.setClothesModification(pantsSetLengthToShorts);
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
