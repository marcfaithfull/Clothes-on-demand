package org.example.clothing;

import org.example.colour.Colour;

public class TShirt {
    int id;
    String name;
    int price;
    String size;
    String material;
    Colour colour;
    boolean isLongSleeve;
    boolean isVNeck;

    private TShirt(TShirtBuilder TShirtBuilder) {
        this.id = TShirtBuilder.id;
        this.name = TShirtBuilder.name;
        this.price = TShirtBuilder.price;
        this.size = TShirtBuilder.size;
        this.material = TShirtBuilder.material;
        this.colour = TShirtBuilder.colour;
        this.isLongSleeve = TShirtBuilder.isLongSleeve;
        this.isVNeck = TShirtBuilder.isVNeck;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public boolean isLongSleeve() {
        return isLongSleeve;
    }

    public void setLongSleeve(boolean longSleeve) {
        isLongSleeve = longSleeve;
    }

    public boolean isVNeck() {
        return isVNeck;
    }

    public void setVNeck(boolean VNeck) {
        isVNeck = VNeck;
    }

    public static class TShirtBuilder extends ClothesBuilder {
        private int id;
        private String name;
        private int price;
        private String size;
        private String material;
        private Colour colour;
        private boolean isLongSleeve;
        private boolean isVNeck;

        public TShirtBuilder(String size, String material, Colour colour) {
            super(colour);
            this.size = size;
            this.material = material;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColour(Colour colour) {
            this.colour = colour;
        }

        public void setLongSleeve(boolean longSleeve) {
            isLongSleeve = longSleeve;
        }

        public void setVNeck(boolean VNeck) {
            isVNeck = VNeck;
        }

        public TShirt build() {
            return new TShirt(this);
        }

        @Override
        public void applyColour() {
            this.colour.applyColour();
        }
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", colour=" + colour +
                ", isLongSleeve=" + isLongSleeve +
                ", isVNeck=" + isVNeck +
                '}';
    }
}
