package org.example.pages;

import org.example.clothing.skirt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SkirtMenu {
    static SkirtModifier skirtModifier = new SkirtModifier();

    public static void chooseWaistline(Scanner scanner, Skirt skirt) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose waistline type");
                System.out.println("1) Regular");
                System.out.println("2) High");
                System.out.print("Option: ");

                int waistlineChoice = scanner.nextInt();

                switch (waistlineChoice) {
                    case 1:
                        SkirtSetWaistlineToRegular skirtSetWaistlineToRegular = new SkirtSetWaistlineToRegular(skirt);
                        skirtModifier.setSkirtModification(skirtSetWaistlineToRegular);
                        skirtModifier.confirm();
                        return;
                    case 2:
                        SkirtSetWaistlineToHigh skirtSetWaistlineToHigh = new SkirtSetWaistlineToHigh(skirt);
                        skirtModifier.setSkirtModification(skirtSetWaistlineToHigh);
                        skirtModifier.confirm();
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

    public static void choosePattern(Scanner scanner, Skirt skirt) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Choose your length");
                System.out.println("1) Regular");
                System.out.println("2) Flowery");
                System.out.print("Option: ");

                int PatternChoice = scanner.nextInt();

                switch (PatternChoice) {
                    case 1:
                        SkirtSetPatternToPlain skirtSetPatternToPlain = new SkirtSetPatternToPlain(skirt);
                        skirtModifier.setSkirtModification(skirtSetPatternToPlain);
                        skirtModifier.confirm();
                        return;
                    case 2:
                        SkirtSetPatternToFlowery skirtSetPatternToFlowery = new SkirtSetPatternToFlowery(skirt);
                        skirtModifier.setSkirtModification(skirtSetPatternToFlowery);
                        skirtModifier.confirm();
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
