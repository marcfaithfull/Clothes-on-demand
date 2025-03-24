package org.example.clothing.pants;

import org.example.Observer;
import org.example.Subject;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

import java.util.ArrayList;
import java.util.List;

public class PantsBuilder implements Subject {
    private final Pants pants;
    List<Observer> observers = new ArrayList<>();

    public PantsBuilder() {
        this.pants = new Pants();
    }

    public PantsBuilder size(Size size) {
        pants.setSize(size);
        return this;
    }

    public PantsBuilder material(Material material) {
        pants.setMaterial(material);
        return this;
    }

    public PantsBuilder colour(Colour colour) {
        pants.setColour(colour);
        return this;
    }

    public Pants build() {
        notifyObservers("A pair of pants is being manufactured");
        return pants;
    }

    @Override
    public void addObserver(Observer Observer) {
        observers.add(Observer);
    }

    @Override
    public void removeObserver(Observer Observer) {

    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
