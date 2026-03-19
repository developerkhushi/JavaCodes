package com.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update("New video uploaded!!");
        }
    }

    @Override
    public void uploadVideo() {
        System.out.println("Video uploaded!");
        notifyObservers();
    }
}
