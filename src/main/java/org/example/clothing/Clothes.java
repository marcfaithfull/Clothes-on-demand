package org.example.clothing;

import org.example.colour.Colour;

public abstract class Clothes {
    private Colour colour;

    public Clothes(Colour colour) {
        this.colour = this.colour;
    }

    public void applyColour() {
        colour.applyColour();
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
