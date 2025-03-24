package org.example.clothing.tshirt;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class TShirtBuilder {
    private final TShirt tshirt;

    public TShirtBuilder() {
        this.tshirt = new TShirt();
    }

    public TShirtBuilder size(Size size) {
        tshirt.setSize(size);
        return this;
    }

    public TShirtBuilder material(Material material) {
        tshirt.setMaterial(material);
        return this;
    }

    public TShirtBuilder colour(Colour colour) {
        tshirt.setColour(colour);
        return this;
    }

    public TShirt build() {
        return tshirt;
    }
}
