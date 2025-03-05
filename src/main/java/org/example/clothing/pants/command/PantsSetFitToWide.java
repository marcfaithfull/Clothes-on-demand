package org.example.clothing.pants.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.pants.Pants;

public class PantsSetFitToWide implements ClothesCommand {
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
