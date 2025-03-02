package org.example;

import org.example.clothing.*;
import org.example.colour.BlueColour;
import org.example.colour.Colour;
import org.example.colour.GreenColour;
import org.example.colour.RedColour;

public class App {
    public static void main(String[] args) {
        Colour redColour = new RedColour();
        ItemOfClothing groovy = new Pants.PantsBuilder("M", "T", redColour).build();
        groovy.applyColour();
        System.out.println(groovy.getSize());
        System.out.println(groovy.getColour());
        System.out.println(groovy.toString());



//        Colour redColour = new RedColour();
//        Colour greenColour = new GreenColour();
//        Colour blueColour = new BlueColour();
//
////        Clothes blueSkirt = new Skirt.SkirtBuilder("M", "Wool", blueColour).build();
////        blueSkirt.applyColour();
////        System.out.println(blueSkirt.getColour());
//
//        Skirt skirt = new Skirt.SkirtBuilder("M", "Cotton", greenColour).build();
//        System.out.println(skirt.toString());
//        greenColour.applyColour();
//        System.out.println(skirt.toString());
//
//
//        Pants pants = new Pants.PantsBuilder("M", "Cotton", new RedColour()).build();
//
//        System.out.println(pants.toString());
//        Customer customer = new Customer("Marc");
//        System.out.println(customer.getId());
//
//        Customer customer2 = new Customer("Tim");
//        System.out.println(customer2.getId());
//
//        redColour.applyColour();
//        System.out.println("Here");
//        TShirt tShirt = new TShirt.TShirtBuilder("M", "Wool", redColour).build();
//        redColour.applyColour();
//        tShirt.setLongSleeve(true);
//        System.out.println(tShirt.getColour());
//        System.out.println(tShirt.toString());

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
