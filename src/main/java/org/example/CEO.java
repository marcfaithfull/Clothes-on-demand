package org.example;

import org.example.order.Observer;

public class CEO implements Observer {
    private final static CEO CEO = new CEO();
    private final static long ID = 205012113333L;
    private final static String NAME = "Tomas Wigell";

    private CEO() {
    }

    public static CEO getCEO() {
        return CEO;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public void update(String message) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Notification for " + getName() + ": " + message);
    }
}
