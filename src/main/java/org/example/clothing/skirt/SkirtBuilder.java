package org.example.clothing.skirt;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class SkirtBuilder {
    private final Skirt skirt;

    public SkirtBuilder() {
        this.skirt = new Skirt();
    }

    public SkirtBuilder size(Size size) {
        skirt.setSize(size);
        return this;
    }

    public SkirtBuilder material(Material material) {
        skirt.setMaterial(material);
        return this;
    }

    public SkirtBuilder colour(Colour colour) {
        skirt.setColour(colour);
        return this;
    }

    public Skirt build() {
        return skirt;
    }
}
