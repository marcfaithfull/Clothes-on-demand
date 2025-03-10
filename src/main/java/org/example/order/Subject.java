package org.example.order;

public interface Subject {
    void addObserver(Observer Observer);
    void removeObserver(Observer Observer);
    void notifyObservers(String message);
}
