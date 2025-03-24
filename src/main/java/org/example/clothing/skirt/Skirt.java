package org.example.clothing.skirt;

import org.example.clothing.ItemOfClothing;

public class Skirt extends ItemOfClothing {
    private final int id = 130;
    private final String name = "Skirt";
    private final int price = 400;
    private boolean isHighWaistline;
    private boolean isFlowery;

    public int getPrice() {
        return price;
    }

    public void setHighWaistline(boolean highWaistline) {
        isHighWaistline = highWaistline;
    }

    public void setFlowery(boolean flowery) {
        isFlowery = flowery;
    }

    @Override
    public String toString() {
        return  name + " (#" + id + ")" +
                "\nPrice: " + price + "kr" +
                "\nSize: " + getSize() +
                "\nMaterial: " + getMaterial() +
                "\nColour: " + getColour() +
                "\nHigh waistline: " + isHighWaistline +
                "\nFlowery: " + isFlowery;
    }
}
