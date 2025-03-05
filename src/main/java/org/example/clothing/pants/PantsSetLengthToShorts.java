package org.example.clothing.pants;

public class PantsSetLengthToShorts implements PantsModification {
    Pants pants;

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
