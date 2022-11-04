package com.mj.song.designpattern.creationalpatterns.factorymethodpattern;

/**
 * creator as known as Factory
 */
public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod(String name) {
        System.out.println("made by ConcreteCreatorA");
        Product p = null;
        switch (name){
            case "A" : p = new ConcreteProductA(); break;
            case "B" : p = new ConcreteProductB(); break;
        }
        return p;
    }
}
