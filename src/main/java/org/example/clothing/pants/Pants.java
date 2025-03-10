package org.example.clothing.pants;

import org.example.clothing.ItemOfClothing;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Pants extends ItemOfClothing {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean areWide;
    private boolean areShorts;

    public Pants(PantsBuilder pantsBuilder) {
        this.id = pantsBuilder.id;
        this.name = pantsBuilder.name;
        this.price = pantsBuilder.price;
        this.size = pantsBuilder.size;
        this.material = pantsBuilder.material;
        this.colour = pantsBuilder.colour;
        this.areWide = pantsBuilder.areWide;
        this.areShorts = pantsBuilder.areShorts;
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

    public void setAreWide(boolean areWide) {
        this.areWide = areWide;
    }

    public void setAreShorts(boolean areShorts) {
        this.areShorts = areShorts;
    }

    @Override
    public String toString() {
        return  getName() + " (#" + getId() + ")" +
                "\nPrice: " + getPrice() + "kr" +
                "\nSize: " + size +
                "\nMaterial: " + material +
                "\nColour: " + colour +
                "\nWide fit: " + areWide +
                "\nShorts: " + areShorts;
    }

    public static class PantsBuilder {
        private final int id = 65;
        private final String name = "Pants";
        private final int price = 500;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean areWide;
        private boolean areShorts;

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
