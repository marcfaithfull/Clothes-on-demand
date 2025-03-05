package org.example.clothing.pants;

public class PantsSetLengthToShorts implements PantsCommand {

    @Override
    public void execute(Pants pants) {
        pants.setAreShorts(true);
        System.out.println("LENGTH SHORTS");
    }
}
