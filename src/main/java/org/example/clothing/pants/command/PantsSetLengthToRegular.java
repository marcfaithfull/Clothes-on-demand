package org.example.clothing.pants.command;

import org.example.clothing.ClothesCommand;
import org.example.clothing.pants.Pants;

public class PantsSetLengthToRegular implements ClothesCommand {
    private final Pants pants;

    public PantsSetLengthToRegular(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreShorts(false);
        System.out.println("LENGTH: REGULAR");
    }
}
