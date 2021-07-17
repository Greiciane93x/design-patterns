package com.studant.designpattern.observer;

public interface Observable {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

}
