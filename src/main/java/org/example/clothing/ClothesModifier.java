package org.example.clothing;

import java.util.ArrayList;
import java.util.List;

public class ClothesModifier {
    private final List<ClothesCommand> clothesCommands = new ArrayList<>();

    public void addClothesModification(ClothesCommand clothesCommand) {
        clothesCommands.add(clothesCommand);
    }

    public void confirmModification() {
        for (ClothesCommand clothesCommand : clothesCommands) {
            clothesCommand.execute();
        }
        clothesCommands.clear();
    }
}
