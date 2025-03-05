package org.example;

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
                            .size(chooseSize(scanner))
                            .material(chooseMaterial(scanner))
                            .colour(chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");

                    System.out.println("Build method complete");

                    PantsMenu.chooseFit(scanner, pants);
                    PantsMenu.chooseLength(scanner, pants);

                    System.out.println(pants);

                    // Inform CEO that an order is in place
                    // What fit?
                    // What length?
                    // Place order?
                    // Send receipt

                    break;

                case 2:
                    tShirt = new TShirt.TShirtBuilder()
                            .size(chooseSize(scanner))
                            .material(chooseMaterial(scanner))
                            .colour(chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println(tShirt);

                case 3:
                    skirt = new Skirt.SkirtBuilder()
                            .size(chooseSize(scanner))
                            .material(chooseMaterial(scanner))
                            .colour(chooseColour(scanner))
                            .build();

                    System.out.println("----------------------------------------------------------------------------------------");

                    System.out.println("Build method complete");

                    SkirtMenu.chooseWaistline(scanner, skirt);
                    SkirtMenu.choosePattern(scanner, skirt);

                default:
                    ProductPage.loadErrorMessage();
            }
            System.out.println(pants);
            System.out.println(tShirt);
            System.out.println(skirt);

            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Happy happy");
            scanner.nextLine();
        }
    }

    /*private static void chooseFit(Scanner scanner, Pants pants, PantsInvoker pantsInvoker) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your fit");
                System.out.println("1) Regular");
                System.out.println("2) Wide");
                System.out.print("Option: ");

                int fitChoice = scanner.nextInt();
                //scanner.nextLine();

                switch (fitChoice) {
                    case 1:
                        PantsSetFitToRegular pantsSetFitToRegular = new PantsSetFitToRegular();
                        pantsInvoker.setStyle(pants, pantsSetFitToRegular);
                        return;
                    case 2:
                        PantsSetFitToWide pantsSetFitToWide = new PantsSetFitToWide();
                        pantsInvoker.setStyle(pants, pantsSetFitToWide);
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
    }*/

    /*public static void chooseLength(Scanner scanner, Pants pants) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your length");
                System.out.println("1) Ankle Swingers");
                System.out.println("2) Normal");
                System.out.print("Option: ");

                int lengthChoice = scanner.nextInt();
                //scanner.nextLine();

                switch (lengthChoice) {
                    case 1:
                        pants.setAreShorts(true);
                        return;
                        case 2:
                            pants.setAreShorts(false);
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
    }*/

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