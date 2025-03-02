package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class TShirt extends ItemOfClothing {
    protected boolean isLongSleeve;
    protected boolean isVNeck;

    public TShirt(ItemOfClothingBuilder<?, ?> itemOfClothingBuilder) {
        super(itemOfClothingBuilder);

        if (!(itemOfClothingBuilder instanceof TShirtBuilder)) {
            throw new IllegalArgumentException("TShirt builder must be an instance of TShirtBuilder");
        }

        TShirtBuilder tShirtBuilder = (TShirtBuilder) itemOfClothingBuilder;
        this.isLongSleeve = tShirtBuilder.isLongSleeve;
        this.isVNeck = tShirtBuilder.isVNeck;
    }

    @Override
    public ItemOfClothing build() {
        return this;
    }

    @Override
    public void applyColour() {
        System.out.println("colour applied");
    }

    @Override
    public void applyMaterial() {
        System.out.println("material applied");
    }

    @Override
    public void applySize() {
        System.out.println("size applied");
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "colour=" + colour +
                '}';
    }

    public static class TShirtBuilder extends ItemOfClothingBuilder<TShirt, TShirtBuilder> {
        protected boolean isLongSleeve;
        protected boolean isVNeck;

        public TShirtBuilder(Size size, Material material, Colour colour) {
            super(size, material, colour);
        }

        public TShirtBuilder getSleeve(boolean isLongSleeve) {
            this.isLongSleeve = isLongSleeve;
            return this;
        }

        public TShirtBuilder isVNeck(boolean isVNeck) {
            this.isVNeck = isVNeck;
            return this;
        }

        @Override
        public TShirt build() {
            return new TShirt(this);
        }
    }
}
