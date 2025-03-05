package org.example.clothing.skirt.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.skirt.Skirt;

public class SkirtSetPatternToPlain implements ClothesModification {
    private final Skirt skirt;

    public SkirtSetPatternToPlain(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setFlowery(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("PATTERN PLAIN");
    }
}
