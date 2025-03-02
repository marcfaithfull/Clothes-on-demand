package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public abstract class ItemOfClothing {
    protected int id;
    protected String name;
    protected int price;
    protected Size size;
    protected Material material;
    protected Colour colour;

    protected ItemOfClothing(ItemOfClothingBuilder<?,?> itemOfClothingBuilder) {
        this.size = itemOfClothingBuilder.getSize();
        this.material = itemOfClothingBuilder.getMaterial();
        this.colour = itemOfClothingBuilder.getColour();
    }

    public int getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }

    public Colour getColour() {
        return colour;
    }

    public abstract ItemOfClothing build();

    public abstract void applyColour();

    public abstract void applyMaterial();

    public abstract void applySize();
}
