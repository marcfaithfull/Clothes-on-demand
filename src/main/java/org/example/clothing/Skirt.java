package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Skirt {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isHighWaistline;
    private boolean isStripy;

    public static class SkirtBuilder {
        private int id;
        private String name;
        private int price;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean isHighWaistline;
        private boolean isStripy;
    }
}
