package org.example.clothing.tshirt;

import org.example.clothing.ItemOfClothing;

public class TShirt extends ItemOfClothing {
    private final int id = 195;
    private final String name = "TShirt";
    private final int price = 300;
    private boolean isLongSleeve;
    private boolean isVNeck;

    public int getPrice() {
        return price;
    }

    public void setLongSleeve(boolean longSleeve) {
        isLongSleeve = longSleeve;
    }

    public void setVNeck(boolean VNeck) {
        isVNeck = VNeck;
    }

    @Override
    public String toString() {
        return  name + " (#" + id + ")" +
                "\nPrice: " + price + "kr" +
                "\nSize: " + getSize() +
                "\nMaterial: " + getMaterial() +
                "\nColour: " + getColour() +
                "\nLong Sleeve: " + isLongSleeve +
                "\nV-Neck: " + isVNeck;
    }
}
