package org.example.clothing.tshirt.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.tshirt.TShirt;

public class TShirtSetSleevesToLong implements ClothesModification {
    private final TShirt tshirt;

    public TShirtSetSleevesToLong(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public void execute() {
        tshirt.setLongSleeve(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("SLEEVES LONG");
    }
}
