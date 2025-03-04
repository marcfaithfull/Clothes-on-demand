package org.example;

import org.example.clothing.*;
import org.example.colour.GreenColour;
import org.example.material.CottonMaterial;
import org.example.material.PolyesterMaterial;
import org.example.size.SmallSize;

public class App {
    public static void main(String[] args) {

        Pants pants = new Pants.PantsBuilder()
                .size(new SmallSize())
                .material(new CottonMaterial())
                .colour(new GreenColour())
                .build();

        System.out.println(pants);

        pants.setIsTightTitting(true);
        pants.setLength(32);
        pants.setMaterial(new PolyesterMaterial());

        System.out.println(pants);
//        WelcomePage.loadWelcomePage();
//
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int id = 0;
//        Customer customer = new Customer.CustomerBuilder(id, name).build();
//
//        while (true) {
//
//            ProductPage.loadProductPage(customer);
//
//            if (!scanner.hasNextInt()) {
//                ProductPage.loadErrorMessage();
//                scanner.next();
//                continue;
//            }
//
//            int userInput = scanner.nextInt();
//            switch (userInput) {
//
//                case 1:
//                    boolean tShirtPageIsActive = true;
//                    while (tShirtPageIsActive) {
//
//                        TShirtPage.loadTShirtPage();
//
//                        userInput = scanner.nextInt();
//                        switch (userInput) {
//
//                            case 1:
//                                //Red
//                                System.out.println("Red");
//                                break;
//
//                            case 2:
//                                tShirtPageIsActive = false;
//                                break;
//                        }
//                    }
//
//                case 2:
//                    System.out.println("number 2");
//
//                case 3:
//                    System.out.println("number 3");
//
//                case 4:
//                    return;
//
//                default:
//                    ProductPage.loadErrorMessage();
//
//            }
//        }
    }
}
