package org.example.clothing.skirt;

public class SkirtSetPatternToFlowery implements SkirtModification {
    Skirt skirt;

    public SkirtSetPatternToFlowery(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setFlowery(true);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("PATTERN FLOWERY");
    }
}
