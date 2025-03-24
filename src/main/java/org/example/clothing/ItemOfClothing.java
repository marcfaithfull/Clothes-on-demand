package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class ItemOfClothing {
    private Size size;
    private Material material;
    private Colour colour;
    int price;

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

    public int getPrice() {
        return price;
    }
}
