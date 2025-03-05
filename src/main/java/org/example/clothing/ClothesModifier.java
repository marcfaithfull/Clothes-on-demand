package org.example.clothing;

public class ClothesModifier {
    private ClothesModification clothesModification;

    public void setClothesModification(ClothesModification clothesModification) {
        this.clothesModification = clothesModification;
    }

    public void confirm() {
        clothesModification.execute();
    }
}
