package org.example.clothing.tshirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.tshirt.TShirt;

public class TShirtSetNeckToRegular implements ClothesCommand {
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
