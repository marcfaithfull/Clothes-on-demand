package org.example.clothing.skirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.skirt.Skirt;

public class SkirtSetWaistlineToHigh implements ClothesCommand {
    private final Skirt skirt;

    public SkirtSetWaistlineToHigh(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setHighWaistline(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("WAISTLINE: HIGH");
    }
}
