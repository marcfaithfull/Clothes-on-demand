package org.example.clothing.pants;

public class PantsSetLengthToRegular implements PantsCommand {

    @Override
    public void execute(Pants pants) {
        pants.setAreShorts(false);
        System.out.println("LENGTH REGULAR");
    }
}
