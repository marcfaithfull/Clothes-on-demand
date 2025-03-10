package org.example.order;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {
    private int id;
    private String name;
    private List<Observer> observers;

    public Order() {}

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
        this.observers = new ArrayList<>();
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

    @Override
    public void addObserver(Observer basketObserver) {
        observers.add(basketObserver);
    }

    @Override
    public void removeObserver(Observer basketObserver) {
        observers.remove(basketObserver);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
