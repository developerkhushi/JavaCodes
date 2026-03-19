package com.java.designpatterns.observer;

public interface Subject {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
    void uploadVideo();
}
