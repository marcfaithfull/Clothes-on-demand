package org.example.clothing.skirt;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Skirt {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isHighWaistline;
    private boolean isStripy;

    public Skirt(SkirtBuilder skirtBuilder) {
        this.id = skirtBuilder.id;
        this.name = skirtBuilder.name;
        this.price = skirtBuilder.price;
        this.size = skirtBuilder.size;
        this.material = skirtBuilder.material;
        this.colour = skirtBuilder.colour;
        this.isHighWaistline = skirtBuilder.isHighWaistline;
        this.isStripy = skirtBuilder.isStripy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public boolean isHighWaistline() {
        return isHighWaistline;
    }

    public void setHighWaistline(boolean highWaistline) {
        isHighWaistline = highWaistline;
    }

    public boolean isStripy() {
        return isStripy;
    }

    public void setStripy(boolean stripy) {
        isStripy = stripy;
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", material=" + material +
                ", colour=" + colour +
                ", isHighWaistline=" + isHighWaistline +
                ", isStripy=" + isStripy +
                '}';
    }

    public static class SkirtBuilder {
        private int id;
        private String name;
        private int price;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean isHighWaistline;
        private boolean isStripy;

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
