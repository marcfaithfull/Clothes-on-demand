package org.example;

import org.example.clothing.ItemOfClothing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer implements Subject {
    private final int id;
    private String name;
    private String address;
    private String mail;

    private static final AtomicInteger nextId = new AtomicInteger(100);
    List<ItemOfClothing> basket = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public Customer() {
        this.id = nextId.getAndIncrement();
    }

    public List<ItemOfClothing> getBasket() {
        return basket;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addItemToBasket(ItemOfClothing itemOfClothing) {
        basket.add(itemOfClothing);
        notifyObservers("The item of clothing is ready");
    }
}
