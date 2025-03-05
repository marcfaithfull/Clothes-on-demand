package org.example.clothing.pants.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.pants.Pants;

public class PantsSetFitToRegular implements ClothesCommand {
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
