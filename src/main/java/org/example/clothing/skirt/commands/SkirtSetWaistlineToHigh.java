package org.example.clothing.skirt.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.skirt.Skirt;

public class SkirtSetWaistlineToHigh implements ClothesModification {
    private final Skirt skirt;

    public SkirtSetWaistlineToHigh(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setHighWaistline(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("WAISTLINE HIGH");
    }
}
