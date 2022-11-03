package com.mj.song.designpattern.factorymethodpattern;

/**
 * creator as known as Factory
 */
public class ConcreteCreatorB extends Creator{

    @Override
    public Product factoryMethod(String name) {
        System.out.println("made by ConcreteCreatorB");
        Product p = null;
        switch (name){
            case "A" : p = new ConcreteProductA(); break;
            case "B" : p = new ConcreteProductB(); break;
        }
        return p;
    }
}
