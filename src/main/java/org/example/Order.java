package org.example;

import org.example.clothing.ItemOfClothing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order implements Subject {
    private final int id;
    private final String name;
    private static final AtomicInteger nextId = new AtomicInteger(1000);
    private final List<Observer> observers = new ArrayList<>();
    private final List<ItemOfClothing> itemsOrdered;

    public Order(Customer customer) {
        this.id = nextId.getAndIncrement();
        this.name = customer.getName() + " (" + LocalDateTime.now() + ")";
        this.itemsOrdered = customer.getBasket();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void orderComplete() {
        notifyObservers("Order number #" + getId() + " complete");
    }

    public List<ItemOfClothing> getItemsOrdered() {
        return itemsOrdered;
    }
}
