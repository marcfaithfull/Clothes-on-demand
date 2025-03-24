package org.example.clothing.pants;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class PantsBuilder {
    private final Pants pants;

    public PantsBuilder() {
        this.pants = new Pants();
    }

    public PantsBuilder size(Size size) {
        pants.setSize(size);
        return this;
    }

    public PantsBuilder material(Material material) {
        pants.setMaterial(material);
        return this;
    }

    public PantsBuilder colour(Colour colour) {
        pants.setColour(colour);
        return this;
    }

    public Pants build() {
        return pants;
    }
}
