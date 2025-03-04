package org.example.colour;

public class GreenColour implements Colour {

    @Override
    public void applyColour() {
        System.out.println("Green");
    }

    @Override
    public String toString() {
        return "GreenColour{}";
    }
}
