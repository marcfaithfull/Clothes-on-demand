package org.example;

public interface Subject {
    void addObserver(Observer Observer);
    void removeObserver(Observer Observer);
    void notifyObservers(String message);
}
