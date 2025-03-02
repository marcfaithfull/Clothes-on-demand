package org.example.clothing;

import org.example.colour.Colour;

public abstract class ItemOfClothing {
    protected int id;
    protected String name;
    protected int price;
    protected String size;
    protected String material;
    protected Colour colour;

    protected ItemOfClothing(ItemOfClothingBuilder<?,?> itemOfClothingBuilder) {
        this.size = itemOfClothingBuilder.getSize();
        this.material = itemOfClothingBuilder.getMaterial();
        this.colour = itemOfClothingBuilder.getColour();
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

    public abstract ItemOfClothing build();

    public abstract void applyColour();
}
