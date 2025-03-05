package org.example.clothing.pants.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.pants.Pants;

public class PantsSetLengthToRegular implements ClothesModification {
    private final Pants pants;

    public PantsSetLengthToRegular(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreShorts(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("LENGTH REGULAR");
    }
}
