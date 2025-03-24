package org.example.clothing.skirt;

import org.example.Observer;
import org.example.Subject;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

import java.util.ArrayList;
import java.util.List;

public class SkirtBuilder implements Subject {
    private final Skirt skirt;
    List<Observer> observers = new ArrayList<>();

    public SkirtBuilder() {
        this.skirt = new Skirt();
    }

    public SkirtBuilder size(Size size) {
        skirt.setSize(size);
        return this;
    }

    public SkirtBuilder material(Material material) {
        skirt.setMaterial(material);
        return this;
    }

    public SkirtBuilder colour(Colour colour) {
        skirt.setColour(colour);
        return this;
    }

    public Skirt build() {
        notifyObservers("A skirt is being manufactured");
        return skirt;
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
