package org.example.menu;

import org.example.colour.BlueColour;
import org.example.colour.Colour;
import org.example.colour.GreenColour;
import org.example.colour.RedColour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ColourMenu {

    public static Colour chooseColour(Scanner scanner) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("What colour would you like?");
                System.out.println("1) Red");
                System.out.println("2) Green");
                System.out.println("3) Blue");
                System.out.print("Option: ");

                int colourChoice = scanner.nextInt();

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
