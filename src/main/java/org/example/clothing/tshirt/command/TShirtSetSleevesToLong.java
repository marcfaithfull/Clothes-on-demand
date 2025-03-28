package org.example.clothing.tshirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.tshirt.TShirt;

public class TShirtSetSleevesToLong implements ClothesCommand {
    private final TShirt tshirt;

    public TShirtSetSleevesToLong(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public void execute() {
        tshirt.setLongSleeve(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("SLEEVES: LONG");
    }
}
