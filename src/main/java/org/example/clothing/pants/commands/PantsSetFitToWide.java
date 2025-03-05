package org.example.clothing.pants.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.pants.Pants;

public class PantsSetFitToWide implements ClothesModification {
    private final Pants pants;

    public PantsSetFitToWide(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreWide(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("FIT WIDE");
    }
}
