package org.example;

import org.example.clothing.Pants;
import org.example.clothing.Skirt;
import org.example.clothing.TShirt;
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

            Size size;
            Material material;
            Colour colour;

            switch (userInput) {
                case 1:
                    Pants pants = new Pants.PantsBuilder()
                            .size(chooseSize(scanner))
                            .material(chooseMaterial(scanner))
                            .colour(chooseColour(scanner))
                            .build();


                    System.out.println(pants);
                    // What fit?
                    // What length?
                    // Place order?
                    // Inform CEO
                    // Send receipt

                    break;

                case 2:
                    // TShirt
                    SizePage.loadSizePage();
                    size = chooseSize(scanner);
                    MaterialPage.loadMaterialPage();
                    material = chooseMaterial(scanner);
                    ColourPage.loadColourPage();
                    colour = chooseColour(scanner);

                    TShirt tShirt = new TShirt.TShirtBuilder()
                            .size(size)
                            .material(material)
                            .colour(colour)
                            .build();

                    System.out.println(tShirt);

                case 3:
                    // Skirt
                    SizePage.loadSizePage();
                    size = chooseSize(scanner);
                    MaterialPage.loadMaterialPage();
                    material = chooseMaterial(scanner);
                    ColourPage.loadColourPage();
                    colour = chooseColour(scanner);

                    Skirt skirt = new Skirt.SkirtBuilder()
                            .size(size)
                            .material(material)
                            .colour(colour)
                            .build();

                    System.out.println(skirt);

                default:
                    ProductPage.loadErrorMessage();
            }
        }
    }

    private static Size chooseSize(Scanner scanner) {
        while (true) {
            try {

                SizePage.loadSizePage();

                int sizeChoice = scanner.nextInt();
                //scanner.nextLine();

                switch (sizeChoice) {
                    case 1:
                        return new SmallSize();
                    case 2:
                        return new MediumSize();
                    case 3:
                        return new LargeSize();
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

    private static Material chooseMaterial(Scanner scanner) {
        while (true) {
            try {
                MaterialPage.loadMaterialPage();

                int materialChoice = scanner.nextInt();
                //scanner.nextLine();
                switch (materialChoice) {
                    case 1:
                        return new CottonMaterial();
                    case 2:
                        return new PolyesterMaterial();
                    case 3:
                        return new LinenMaterial();
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

    private static Colour chooseColour(Scanner scanner) {
        while (true) {
            try {
                ColourPage.loadColourPage();


                int colourChoice = scanner.nextInt();
                //scanner.nextLine();
                switch (colourChoice) {
                    case 1:
                        return new RedColour();
                    case 2:
                        return new GreenColour();
                    case 3:
                        return new BlueColour();
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