package org.example.clothing.skirt;

public class SkirtModifier {
    private SkirtModification skirtModification;

    public void setSkirtModification(SkirtModification skirtModification) {
        this.skirtModification = skirtModification;
    }

    public void confirm() {
        skirtModification.execute();
    }
}
