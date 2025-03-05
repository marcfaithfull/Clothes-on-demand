package org.example.menu;

import org.example.material.CottonMaterial;
import org.example.material.LinenMaterial;
import org.example.material.Material;
import org.example.material.PolyesterMaterial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaterialMenu {

    public static Material chooseMaterial(Scanner scanner) {
        while (true) {
            try {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("What material are you interested in?");
                System.out.println("1) Cotton");
                System.out.println("2) Polyester");
                System.out.println("3) Linen");
                System.out.print("Option: ");

                int materialChoice = scanner.nextInt();

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
}
