package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Skirt extends ItemOfClothing {
    protected boolean isHighWaistline;
    protected boolean isStripy;

    public Skirt(ItemOfClothingBuilder<?, ?> itemOfClothingBuilder) {
        super(itemOfClothingBuilder);

        if (!(itemOfClothingBuilder instanceof SkirtBuilder)) {
            throw new IllegalArgumentException("Skirt builder must be an instance of SkirtBuilder");
        }

        SkirtBuilder skirtBuilder = (SkirtBuilder) itemOfClothingBuilder;
        this.isHighWaistline = skirtBuilder.isHighWaistline;
        this.isStripy = skirtBuilder.isStripy;
    }

    @Override
    public ItemOfClothing build() {
        return this;
    }

    @Override
    public void applyColour() {
        System.out.println("Colour applied");
    }

    @Override
    public void applyMaterial() {
        System.out.println("Material applied");
    }

    @Override
    public void applySize() {
        System.out.println("Size applied");
    }

    @Override
    public String toString() {
        return "Pants{" +
                "colour=" + colour +
                '}';
    }

    public static class SkirtBuilder extends ItemOfClothingBuilder<Skirt, SkirtBuilder> {
        private boolean isHighWaistline;
        private boolean isStripy;

        public SkirtBuilder(Size size, Material material, Colour colour) {
            super(size, material, colour);
        }

        public SkirtBuilder getWaistline(boolean isHighWaistline) {
            this.isHighWaistline = isHighWaistline;
            return this;
        }

        public SkirtBuilder getPattern(boolean isStripy) {
            this.isStripy = isStripy;
            return this;
        }

        @Override
        public Skirt build() {
            return new Skirt(this);
        }
    }
}
