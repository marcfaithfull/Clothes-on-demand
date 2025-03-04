package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Pants {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isTightFitting;
    private int length;

    public Pants(PantsBuilder pantsBuilder) {
        this.id = pantsBuilder.id;
        this.name = pantsBuilder.name;
        this.price = pantsBuilder.price;
        this.size = pantsBuilder.size;
        this.material = pantsBuilder.material;
        this.colour = pantsBuilder.colour;
        this.isTightFitting = pantsBuilder.isTightFitting;
        this.length = pantsBuilder.length;
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

    public boolean isTightFitting() {
        return isTightFitting;
    }

    public void setTightTitting(boolean tightFitting) {
        isTightFitting = tightFitting;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", material=" + material +
                ", colour=" + colour +
                ", isTightFitting=" + isTightFitting +
                ", length=" + length +
                '}';
    }

    public static class PantsBuilder {
        private int id;
        private String name;
        private int price;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean isTightFitting;
        private int length;

        public PantsBuilder size(Size size) {
            this.size = size;
            return this;
        }

        public PantsBuilder material(Material material) {
            this.material = material;
            return this;
        }

        public PantsBuilder colour(Colour colour) {
            this.colour = colour;
            return this;
        }

        public Pants build() {
            return new Pants(this);
        }
    }
}
