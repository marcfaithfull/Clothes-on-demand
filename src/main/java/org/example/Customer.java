package org.example;

import org.example.clothing.ItemOfClothing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String mail;

    private static AtomicInteger nextId = new AtomicInteger();
    List<ItemOfClothing> basket = new ArrayList<>();

    public Customer() {
        this.id = nextId.getAndIncrement();
    }

    public List<ItemOfClothing> getBasket() {
        return basket;
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
}
