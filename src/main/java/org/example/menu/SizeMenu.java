package org.example.menu;

import org.example.size.LargeSize;
import org.example.size.MediumSize;
import org.example.size.Size;
import org.example.size.SmallSize;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SizeMenu {

    public static Size chooseSize(Scanner scanner) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("What size would you like?");
                System.out.println("1) Small");
                System.out.println("2) Medium");
                System.out.println("3) Large");
                System.out.print("Option: ");

                int sizeChoice = scanner.nextInt();
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
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }
}
