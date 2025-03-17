package org.example;

public class CEO implements Observer {
    private final static CEO CEO = new CEO();
    private final static String ID = "CEO";
    private final static String NAME = "Tomas Wigell";

    private CEO() {
    }

    public static CEO getCEO() {
        return CEO;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public void update(String message) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Notification for " + getName() + " (" + getID() + "): " + message);
    }
}
