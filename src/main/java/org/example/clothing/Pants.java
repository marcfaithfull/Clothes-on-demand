package org.example.clothing;

import org.example.colour.Colour;

public class Pants {
    private int id;
    private String name;
    private int price;
    private String size;
    private String material;
    private Colour colour;
    private String fit;
    private int length;

    private Pants(PantsBuilder pantsBuilder) {
        this.id = pantsBuilder.Id;
        this.name = pantsBuilder.name;
        this.price = pantsBuilder.price;
        this.size = pantsBuilder.size;
        this.material = pantsBuilder.material;
        this.colour = pantsBuilder.colour;
        this.fit = pantsBuilder.fit;
        this.length = pantsBuilder.length;
    }

    public static class PantsBuilder extends ClothesBuilder {
        private int Id;
        private String name;
        private int price;
        private String size;
        private String material;
        private Colour colour;
        private String fit;
        private int length;

        public PantsBuilder(String size, String material, Colour colour) {
            super(colour);
            this.size = size;
            this.material = material;
        }

        public PantsBuilder setId(int id) {
            this.Id = id;
            return this;
        }

        public PantsBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PantsBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public PantsBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PantsBuilder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public void setColour(Colour colour) {
            this.colour = colour;
        }

        public PantsBuilder setFit(String fit) {
            this.fit = fit;
            return this;
        }

        public PantsBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public Pants build() {
            return new Pants(this);
        }

        @Override
        public void applyColour() {
            this.colour.applyColour();
        }
    }
}
