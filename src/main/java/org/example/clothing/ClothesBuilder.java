package org.example.clothing;

import org.example.colour.Colour;

public abstract class ClothesBuilder {
    public Colour colour;

    public ClothesBuilder(Colour colour) {
        this.colour = colour;
    }

    abstract public void applyColour();

    @Override
    public String toString() {
        return "TShirt{" +
                "colour=" + colour +
                '}';
    }
}
