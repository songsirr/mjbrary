package com.mj.song.designpattern.behavioralpatterns.observerpattern;

public class ObserverProduct implements Observer {

    private String something;

    public ObserverProduct() {
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public void update(Object o) {
        this.something = (String)o;
    }
}
