package org.example.clothing.skirt;

public class SkirtSetPatternToPlain implements SkirtModification {
    private Skirt skirt;

    public SkirtSetPatternToPlain(Skirt skirt) {
        this.skirt = skirt;
    }

    @Override
    public void execute() {
        skirt.setFlowery(false);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("PATTERN PLAIN");
    }
}
