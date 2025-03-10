package org.example.clothing.tshirt;

import org.example.clothing.ItemOfClothing;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class TShirt extends ItemOfClothing {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isLongSleeve;
    private boolean isVNeck;

    public TShirt(TShirtBuilder tShirtBuilder) {
        this.id = tShirtBuilder.id;
        this.name = tShirtBuilder.name;
        this.price = tShirtBuilder.price;
        this.size = tShirtBuilder.size;
        this.material = tShirtBuilder.material;
        this.colour = tShirtBuilder.colour;
        this.isLongSleeve = tShirtBuilder.isLongSleeve;
        this.isVNeck = tShirtBuilder.isVNeck;
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

    public void setLongSleeve(boolean longSleeve) {
        isLongSleeve = longSleeve;
    }

    public void setVNeck(boolean VNeck) {
        isVNeck = VNeck;
    }

    @Override
    public String toString() {
        return  getName() + " (#" + getId() + ")" +
                "\nPrice: " + getPrice() + "kr" +
                "\nSize: " + size +
                "\nMaterial: " + material +
                "\nColour: " + colour +
                "\nLong Sleeve: " + isLongSleeve +
                "\nV-Neck: " + isVNeck;
    }

    public static class TShirtBuilder {
        private final int id = 195;
        private final String name = "TShirt";
        private final int price = 300;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean isLongSleeve;
        private boolean isVNeck;

        public TShirtBuilder size(Size size) {
            this.size = size;
            return this;
        }

        public TShirtBuilder material(Material material) {
            this.material = material;
            return this;
        }

        public TShirtBuilder colour(Colour colour) {
            this.colour = colour;
            return this;
        }

        public TShirt build() {
            return new TShirt(this);
        }
    }
}
