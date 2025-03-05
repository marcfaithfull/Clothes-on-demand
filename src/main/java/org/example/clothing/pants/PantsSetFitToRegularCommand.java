package org.example.clothing.pants;

public class PantsSetFitToRegularCommand implements PantsCommand {
    private boolean areBaggy;

    @Override
    public void execute(Pants pants) {
        pants.setAreWide(false);
        System.out.println("FIT REGULAR");
    }
}
