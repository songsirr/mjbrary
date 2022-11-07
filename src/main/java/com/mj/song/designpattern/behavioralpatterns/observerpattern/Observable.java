package com.mj.song.designpattern.behavioralpatterns.observerpattern;

public interface Observable {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver(Object o);
}
