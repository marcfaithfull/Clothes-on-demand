package org.example.clothing;

import org.example.colour.Colour;

public abstract class ItemOfClothingBuilder<T extends ItemOfClothing, B extends ItemOfClothingBuilder<T, B>> {
    private int id;
    private String name;
    private int price;
    private String size;
    private String material;
    private Colour colour;

    protected ItemOfClothingBuilder(String size, String material, Colour colour) {
        this.size = size;
        this.material = material;
        this.colour = colour;
    }

    public B setPrice(int price) {
        this.price = price;
        return self();
    }

    public B self() {
        return (B) this;
    }

    public abstract T build();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public Colour getColour() {
        return colour;
    }
}
