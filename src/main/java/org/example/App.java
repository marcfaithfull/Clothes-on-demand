package org.example;

import org.example.clothing.ClothesModifier;
import org.example.clothing.pants.*;
import org.example.clothing.skirt.Skirt;
import org.example.clothing.tshirt.TShirt;
import org.example.colour.BlueColour;
import org.example.colour.Colour;
import org.example.colour.GreenColour;
import org.example.colour.RedColour;
import org.example.material.CottonMaterial;
import org.example.material.LinenMaterial;
import org.example.material.Material;
import org.example.material.PolyesterMaterial;
import org.example.pages.*;
import org.example.size.LargeSize;
import org.example.size.Size;
import org.example.size.SmallSize;
import org.example.size.MediumSize;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        Pants pants = new Pants();
//        PantsStyleInvoker pantsStyleInvoker = new PantsStyleInvoker();
//
//        PantsCommand makeBaggy = new PantsSetFitToWideCommand();
//        pantsStyleInvoker.setStyle(pants, makeBaggy);
//        System.out.println(pants);
//        PantsCommand makeRegular = new PantsSetFitToRegularCommand();
//        pantsStyleInvoker.setStyle(pants, makeRegular);
//        System.out.println(pants);
//        PantsCommand makeShorts = new PantsSetLengthToShorts();
//        pantsStyleInvoker.setStyle(pants, makeShorts);
//        System.out.println(pants);


        Size size;
        Material material;
        Colour colour;
        Pants pants = null;
        TShirt tShirt = null;
        Skirt skirt = null;

        ClothesModifier clothesModifier = new ClothesModifier();

        WelcomePage.loadWelcomePage();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Customer customer = new Customer(name);

        while (true) {
            ProductPage.loadProductPage(customer);
            if (!scanner.hasNextInt()) {
                ProductPage.loadErrorMessage();
                scanner.next();
                continue;
            }
            int userInput = scanner.nextInt();


            switch (userInput) {
                case 1:
                    pants = new Pants.PantsBuilder()
                            .size(SizePage.chooseSize(scanner))
                            .material(MaterialPage.chooseMaterial(scanner))
                            .colour(ColourPage.chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Build method complete");

                    PantsMenu.chooseFit(scanner, pants, clothesModifier);
                    PantsMenu.chooseLength(scanner, pants, clothesModifier);

                    System.out.println(pants);

                    // Inform CEO that an order is in place
                    // What fit?
                    // What length?
                    // Place order?
                    // Send receipt

                    break;

                case 2:
                    tShirt = new TShirt.TShirtBuilder()
                            .size(SizePage.chooseSize(scanner))
                            .material(MaterialPage.chooseMaterial(scanner))
                            .colour(ColourPage.chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Build method complete");

                    TShirtMenu.chooseSleeves(scanner, tShirt, clothesModifier);
                    TShirtMenu.chooseNeck(scanner, tShirt, clothesModifier);
                    break;

                case 3:
                    skirt = new Skirt.SkirtBuilder()
                            .size(SizePage.chooseSize(scanner))
                            .material(MaterialPage.chooseMaterial(scanner))
                            .colour(ColourPage.chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Build method complete");

                    SkirtMenu.chooseWaistline(scanner, skirt, clothesModifier);
                    SkirtMenu.choosePattern(scanner, skirt, clothesModifier);
                    break;

                default:
                    ProductPage.loadErrorMessage();
                    continue;
            }
            System.out.println(pants);
            System.out.println(tShirt);
            System.out.println(skirt);
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Happy happy");
            scanner.nextLine();
        }
    }
}