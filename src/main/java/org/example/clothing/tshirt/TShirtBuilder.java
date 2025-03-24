package org.example.clothing.tshirt;

import org.example.Observer;
import org.example.Subject;
import org.example.colour.Colour;
import org.example.material.Material;
import org.example.size.Size;

import java.util.ArrayList;
import java.util.List;

public class TShirtBuilder implements Subject {
    private final TShirt tshirt;
    List<Observer> observers = new ArrayList<>();

    public TShirtBuilder() {
        this.tshirt = new TShirt();
    }

    public TShirtBuilder size(Size size) {
        tshirt.setSize(size);
        return this;
    }

    public TShirtBuilder material(Material material) {
        tshirt.setMaterial(material);
        return this;
    }

    public TShirtBuilder colour(Colour colour) {
        tshirt.setColour(colour);
        return this;
    }

    public TShirt build() {
        notifyObservers("A t-shirt is being manufactured");
        return tshirt;
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
