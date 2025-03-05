package org.example.clothing.pants;

public class PantsSetFitToRegular implements PantsModification {
    private Pants pants;

    public PantsSetFitToRegular(Pants pants) {
        this.pants = pants;
    }

    @Override
    public void execute() {
        pants.setAreWide(false);
        System.out.println("FIT REGULAR");
    }
}
