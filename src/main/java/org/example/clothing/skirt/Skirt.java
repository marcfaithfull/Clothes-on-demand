package org.example.clothing.skirt;

import org.example.clothing.ItemOfClothing;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Skirt extends ItemOfClothing {
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isHighWaistline;
    private boolean isFlowery;

    public int getId() {
        return 130;
    }

    public String getName() {
        return "Skirt";
    }

    public int getPrice() {
        return 400;
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

    public void setHighWaistline(boolean highWaistline) {
        isHighWaistline = highWaistline;
    }

    public void setFlowery(boolean flowery) {
        isFlowery = flowery;
    }

    @Override
    public String toString() {
        return  getName() + " (#" + getId() + ")" +
                "\nPrice: " + getPrice() + "kr" +
                "\nSize: " + size +
                "\nMaterial: " + material +
                "\nColour: " + colour +
                "\nHigh waistline: " + isHighWaistline +
                "\nFlowery: " + isFlowery;
    }
}
