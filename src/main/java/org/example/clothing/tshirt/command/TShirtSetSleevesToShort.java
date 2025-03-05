package org.example.clothing.tshirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.tshirt.TShirt;

public class TShirtSetSleevesToShort implements ClothesCommand {
    private final TShirt tshirt;

    public TShirtSetSleevesToShort(TShirt tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public void execute() {
        tshirt.setLongSleeve(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("SLEEVES SHORT");
    }
}
