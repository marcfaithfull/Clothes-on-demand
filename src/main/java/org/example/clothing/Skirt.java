package org.example.clothing;

import org.example.colour.Colour;

public class Skirt extends Clothes {
    int id;
    String name;
    String size;
    Colour colour;
    boolean isHighWaistline;
    boolean isDotted;

    private Skirt(SkirtBuilder skirtBuilder) {
        super(skirtBuilder.colour);
        this.id = skirtBuilder.id;
        this.name = skirtBuilder.name;
        this.size = skirtBuilder.size;
        this.colour = skirtBuilder.colour;
        this.isHighWaistline = skirtBuilder.isHighWaistline;
        this.isDotted = skirtBuilder.isDotted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public boolean isHighWaistline() {
        return isHighWaistline;
    }

    public void setHighWaistline(boolean highWaistline) {
        isHighWaistline = highWaistline;
    }

    public boolean isDotted() {
        return isDotted;
    }

    public void setDotted(boolean dotted) {
        isDotted = dotted;
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", colour=" + colour +
                ", isHighWaistline=" + isHighWaistline +
                ", isDotted=" + isDotted +
                '}';
    }

    public static class SkirtBuilder extends ClothesBuilder {
        int id;
        String name;
        String size;
        Colour colour;
        boolean isHighWaistline;
        boolean isDotted;

        public SkirtBuilder(String size, String material, Colour colour) {
            super(colour);
        }

        public Skirt build() {
            return new Skirt(this);
        }

        @Override
        public void applyColour() {
            this.colour.applyColour();
        }
    }
}

