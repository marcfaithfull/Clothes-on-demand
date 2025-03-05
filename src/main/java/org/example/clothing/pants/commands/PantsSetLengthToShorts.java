package org.example.clothing.pants.commands;

import org.example.clothing.ClothesModification;
import org.example.clothing.pants.Pants;

public class PantsSetLengthToShorts implements ClothesModification {
    private final Pants pants;

    public PantsSetLengthToShorts(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreShorts(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("LENGTH SHORTS");
    }
}
