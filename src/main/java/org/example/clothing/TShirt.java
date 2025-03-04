package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class TShirt {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isLongSleeve;
    private boolean isVNeck;

    public static class TShirtBuilder {
        private int id;
        private String name;
        private int price;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean isLongSleeve;
        private boolean isVNeck;
    }
}
