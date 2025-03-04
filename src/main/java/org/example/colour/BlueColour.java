package org.example.colour;

public class BlueColour implements Colour {

    @Override
    public void applyColour() {
        System.out.println("Blue");
    }

    @Override
    public String toString() {
        return "BlueColour{}";
    }
}
