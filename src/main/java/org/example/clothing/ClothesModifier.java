package org.example.clothing;

public class ClothesModifier {
    private ClothesCommand clothesCommand;

    public void setClothesModification(ClothesCommand clothesCommand) {
        this.clothesCommand = clothesCommand;
    }

    public void confirm() {
        clothesCommand.execute();
    }
}
