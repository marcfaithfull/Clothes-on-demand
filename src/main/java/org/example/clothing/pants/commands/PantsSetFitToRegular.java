package org.example.clothing.pants.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.pants.Pants;

public class PantsSetFitToRegular implements ClothesModification {
    private final Pants pants;

    public PantsSetFitToRegular(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreWide(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("FIT REGULAR");
    }
}
