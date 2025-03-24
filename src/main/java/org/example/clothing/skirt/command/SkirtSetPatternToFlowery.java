package org.example.clothing.skirt.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.skirt.Skirt;

public class SkirtSetPatternToFlowery implements ClothesCommand {
    private final Skirt skirt;

    public SkirtSetPatternToFlowery(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setFlowery(true);
        System.out.println("PATTERN: FLOWERY");
    }
}
