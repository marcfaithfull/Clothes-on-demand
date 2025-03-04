package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class TShirt {
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

    public boolean isLongSleeve() {
        return isLongSleeve;
    }

    public void setLongSleeve(boolean longSleeve) {
        isLongSleeve = longSleeve;
    }

    public boolean isVNeck() {
        return isVNeck;
    }

    public void setVNeck(boolean VNeck) {
        isVNeck = VNeck;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", material=" + material +
                ", colour=" + colour +
                ", isLongSleeve=" + isLongSleeve +
                ", isVNeck=" + isVNeck +
                '}';
    }

    public static class TShirtBuilder {
        private int id;
        private String name;
        private int price;
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
