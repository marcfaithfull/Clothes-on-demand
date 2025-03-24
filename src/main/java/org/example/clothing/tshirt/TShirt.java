package org.example.clothing.tshirt;

import org.example.clothing.ItemOfClothing;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class TShirt extends ItemOfClothing {
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isLongSleeve;
    private boolean isVNeck;

    public int getId() {
        return 195;
    }

    public String getName() {
        return "TShirt";
    }

    public int getPrice() {
        return 300;
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
}
