package org.example.clothing.skirt;

public class SkirtSetWaistlineToHigh implements SkirtModification {
    private Skirt skirt;

    public SkirtSetWaistlineToHigh(Skirt skirt) {
        this.skirt = skirt;
    }


    @Override
    public void execute() {
        skirt.setHighWaistline(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("WAISTLINE HIGH");
    }
}
