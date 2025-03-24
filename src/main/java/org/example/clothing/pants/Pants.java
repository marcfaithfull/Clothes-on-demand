package org.example.clothing.pants;

import org.example.clothing.ItemOfClothing;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Pants extends ItemOfClothing {
    private Size size;
    private Material material;
    private Colour colour;
    private boolean areWide;
    private boolean areShorts;

    public int getId() {
        return 65;
    }

    public String getName() {
        return "Pants";
    }

    public int getPrice() {
        return 500;
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
}
