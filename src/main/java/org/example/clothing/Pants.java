package org.example.clothing;

import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

public class Pants {
    private int id;
    private String name;
    private int price;
    private Size size;
    private Material material;
    private Colour colour;
    private boolean isTightFitting;
    private int length;

    public static class PantsBuilder {
        private int id;
        private String name;
        private int price;
        private Size size;
        private Material material;
        private Colour colour;
        private boolean isTightFitting;
        private int length;
    }
}
