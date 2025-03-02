package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Pants extends ItemOfClothing {
    protected boolean isTightFitting;
    protected int length;

    public Pants(ItemOfClothingBuilder<?, ?> itemOfClothingBuilder) {
        super(itemOfClothingBuilder);

        if (!(itemOfClothingBuilder instanceof PantsBuilder)) {
            throw new IllegalArgumentException("Pants builder must be an instance of PantsBuilder");
        }

        PantsBuilder pantsBuilder = (PantsBuilder) itemOfClothingBuilder;
        this.isTightFitting = pantsBuilder.isTightFitting;
        this.length = pantsBuilder.length;
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

    public static class PantsBuilder extends ItemOfClothingBuilder<Pants, PantsBuilder> {
        private boolean isTightFitting;
        private int length;

        public PantsBuilder(Size size, Material material, Colour colour) {
            super(size, material, colour);
        }

        public PantsBuilder isTightFitting(boolean isTightFitting) {
            this.isTightFitting = isTightFitting;
            return this;
        }

        public PantsBuilder length(int length) {
            this.length = length;
            return this;
        }

        @Override
        public Pants build() {
            return new Pants(this);
        }
    }

    @Override
    public String toString() {
        return "Pants{" +
                "colour=" + colour +
                '}';
    }
}
