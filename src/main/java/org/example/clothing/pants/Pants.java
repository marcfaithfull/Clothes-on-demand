package org.example.clothing.pants;

import org.example.clothing.ItemOfClothing;

public class Pants extends ItemOfClothing {
    private final int id = 65;
    private final String name = "Pants";
    private final int price = 500;
    private boolean areWide;
    private boolean areShorts;

    public int getPrice() {
        return price;
    }

    public void setAreWide(boolean areWide) {
        this.areWide = areWide;
    }

    public void setAreShorts(boolean areShorts) {
        this.areShorts = areShorts;
    }

    @Override
    public String toString() {
        return  name + " (#" + id + ")" +
                "\nPrice: " + price + "kr" +
                "\nSize: " + getSize() +
                "\nMaterial: " + getMaterial() +
                "\nColour: " + getColour() +
                "\nWide fit: " + areWide +
                "\nShorts: " + areShorts;
    }
}
