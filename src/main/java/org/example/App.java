package org.example;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.pages.ProductPage;
import org.example.pages.ColourPage;
import org.example.pages.WelcomePage;
import org.example.size.Size;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Size size;
        Material material;
        Colour colour;

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
                    // Pants page
                    boolean pantsPageIsActive = true;
                    while (pantsPageIsActive) {

                        ColourPage.loadColourPage();

                        userInput = scanner.nextInt();
                        switch (userInput) {

                            case 1:
                                //Red
                                System.out.println("Red");
                                break;

                            case 2:
                                pantsPageIsActive = false;
                                break;
                        }
                    }

                case 2:
                    System.out.println("number 2");

                case 3:
                    System.out.println("number 3");

                case 4:
                    return;

                default:
                    ProductPage.loadErrorMessage();

            }
        }
    }
}
