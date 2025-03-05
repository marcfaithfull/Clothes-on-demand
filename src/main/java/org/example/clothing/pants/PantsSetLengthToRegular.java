package org.example.clothing.pants;

public class PantsSetLengthToRegular implements PantsModification {
    Pants pants;

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
