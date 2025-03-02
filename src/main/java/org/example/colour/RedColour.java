package org.example.colour;

public class RedColour implements Colour {
    @Override
    public void applyColour() {
        System.out.println("Red");
    }

    @Override
    public String toString() {
        return "Red";
    }


}
