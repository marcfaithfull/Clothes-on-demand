package org.example.clothing.skirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.skirt.Skirt;

public class SkirtSetWaistlineToRegular implements ClothesCommand {
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
