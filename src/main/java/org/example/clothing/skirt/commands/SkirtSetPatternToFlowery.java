package org.example.clothing.skirt.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.skirt.Skirt;

public class SkirtSetPatternToFlowery implements ClothesModification {
    private final Skirt skirt;

    public SkirtSetPatternToFlowery(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setFlowery(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("PATTERN FLOWERY");
    }
}
