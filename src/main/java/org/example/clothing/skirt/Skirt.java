package org.example.clothing.skirt;

import org.example.clothing.ItemOfClothing;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Skirt extends ItemOfClothing {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isHighWaistline;
    private boolean isFlowery;

    public Skirt(SkirtBuilder skirtBuilder) {
        this.id = skirtBuilder.id;
        this.name = skirtBuilder.name;
        this.price = skirtBuilder.price;
        this.size = skirtBuilder.size;
        this.material = skirtBuilder.material;
        this.colour = skirtBuilder.colour;
        this.isHighWaistline = skirtBuilder.isHighWaistline;
        this.isFlowery = skirtBuilder.isFlowery;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setHighWaistline(boolean highWaistline) {
        isHighWaistline = highWaistline;
    }

    public void setFlowery(boolean flowery) {
        isFlowery = flowery;
    }

    @Override
    public String toString() {
        return  getName() + " (#" + getId() + ")" +
                "\nPrice: " + getPrice() + "kr" +
                "\nSize: " + size +
                "\nMaterial: " + material +
                "\nColour: " + colour +
                "\nHigh waistline: " + isHighWaistline +
                "\nFlowery: " + isFlowery;
    }

    public static class SkirtBuilder {
        private final int id = 130;
        private final String name = "Skirt";
        private final int price = 400;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean isHighWaistline;
        private boolean isFlowery;

        public SkirtBuilder size(Size size) {
            this.size = size;
            return this;
        }

        public SkirtBuilder material(Material material) {
            this.material = material;
            return this;
        }

        public SkirtBuilder colour(Colour colour) {
            this.colour = colour;
            return this;
        }

        public Skirt build() {
            return new Skirt(this);
        }
    }
}
