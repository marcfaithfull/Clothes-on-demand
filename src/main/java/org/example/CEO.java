package org.example;

public class CEO {
    private final static CEO CEO = new CEO();
    private final static long ID = 198011111717L;
    private final static String NAME = "Tomas Wigell";

    private CEO() {
    }

    public static CEO getCEO() {
        return CEO;
    }

    public String getName() {
        return NAME;
    }
}
