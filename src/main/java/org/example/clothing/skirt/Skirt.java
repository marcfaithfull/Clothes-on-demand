package org.example.clothing.skirt;

import org.example.clothing.ItemOfClothing;

public class Skirt extends ItemOfClothing {
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
        int id = 130;
        String name = "Skirt";
        return  name + " (#" + id + ")" +
                "\nPrice: " + price + "kr" +
                "\nSize: " + getSize() +
                "\nMaterial: " + getMaterial() +
                "\nColour: " + getColour() +
                "\nHigh waistline: " + isHighWaistline +
                "\nFlowery: " + isFlowery;
    }
}
