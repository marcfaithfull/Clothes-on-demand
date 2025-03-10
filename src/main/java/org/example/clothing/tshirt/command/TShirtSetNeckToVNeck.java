package org.example.clothing.tshirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.tshirt.TShirt;

public class TShirtSetNeckToVNeck implements ClothesCommand {
    private final TShirt tshirt;

    public TShirtSetNeckToVNeck(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public void execute() {
        tshirt.setVNeck(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("NECK V-NECK");
    }
}
