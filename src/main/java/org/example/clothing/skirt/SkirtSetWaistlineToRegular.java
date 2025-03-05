package org.example.clothing.skirt;

public class SkirtSetWaistlineToRegular implements SkirtModification {
    private Skirt skirt;

    public SkirtSetWaistlineToRegular(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setHighWaistline(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("WAISTLINE REGULAR");
    }
}
