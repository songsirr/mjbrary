package com.mj.song.designpattern.behavioralpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableProduct implements Observable {

    private String something;

    private List<Observer> observers = new ArrayList<>();

    public ObservableProduct() {
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(Object o) {
        for (Observer os : this.observers){
            os.update(o);
        }
    }
}
