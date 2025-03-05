package org.example.clothing.pants;

public class PantsSetFitToWide implements PantsModification {
    Pants pants;

    public PantsSetFitToWide(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreWide(true);
        System.out.println("FIT WIDE");
    }
}
