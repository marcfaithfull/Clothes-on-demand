package org.example.clothing.pants.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.pants.Pants;

public class PantsSetLengthToShorts implements ClothesCommand {
    private final Pants pants;

    public PantsSetLengthToShorts(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreShorts(true);
        System.out.println("LENGTH: SHORTS");
    }
}
