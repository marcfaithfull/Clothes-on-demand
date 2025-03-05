package org.example.pages;

import org.example.clothing.pants.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PantsMenu {
    static PantsInvoker pantsInvoker = new PantsInvoker();

    public static void chooseFit(Scanner scanner, Pants pants) {
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
                        pantsSetFitToRegular.execute(pants);
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
    }

    public static void chooseLength(Scanner scanner, Pants pants) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your length");
                System.out.println("1) Regular");
                System.out.println("2) Shorts");
                System.out.print("Option: ");

                int lengthChoice = scanner.nextInt();
                //scanner.nextLine();

                switch (lengthChoice) {
                    case 1:
                        PantsSetLengthToRegular pantsSetLengthToRegular = new PantsSetLengthToRegular();
                        pantsInvoker.setStyle(pants, pantsSetLengthToRegular);
                        return;
                    case 2:
                        PantsSetLengthToShorts pantsSetLengthToShorts = new PantsSetLengthToShorts();
                        pantsInvoker.setStyle(pants, pantsSetLengthToShorts);
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
