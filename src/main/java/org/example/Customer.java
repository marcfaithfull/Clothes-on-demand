package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String email;

    private static AtomicInteger nextId = new AtomicInteger();

    public Customer(String name) {
        this.id = nextId.getAndIncrement();
        this.name = name;
        this.address = address;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
