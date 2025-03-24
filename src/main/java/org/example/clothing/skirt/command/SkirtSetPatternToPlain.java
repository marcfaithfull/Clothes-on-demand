package org.example.clothing.skirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.skirt.Skirt;

public class SkirtSetPatternToPlain implements ClothesCommand {
    private final Skirt skirt;

    public SkirtSetPatternToPlain(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setFlowery(false);
        System.out.println("PATTERN: PLAIN");
    }
}
