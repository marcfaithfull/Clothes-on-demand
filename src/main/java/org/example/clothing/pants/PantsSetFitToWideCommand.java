package org.example.clothing.pants;

public class PantsSetFitToWideCommand implements PantsCommand {

    @Override
    public void execute(Pants pants) {
        pants.setAreWide(true);
        System.out.println("FIT WIDE");
    }
}
