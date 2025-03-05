package org.example.clothing.tshirt.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.tshirt.TShirt;

public class TShirtSetNeckToRegular implements ClothesModification {
private final TShirt tshirt;

    public TShirtSetNeckToRegular(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public void execute() {
        tshirt.setVNeck(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("NECK REGULAR");
    }
}
