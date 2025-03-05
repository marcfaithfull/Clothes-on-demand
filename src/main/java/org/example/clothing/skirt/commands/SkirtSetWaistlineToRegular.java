package org.example.clothing.skirt.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.skirt.Skirt;

public class SkirtSetWaistlineToRegular implements ClothesModification {
    private final Skirt skirt;

    public SkirtSetWaistlineToRegular(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setHighWaistline(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("WAISTLINE REGULAR");
    }
}
