package com.mj.song.designpattern.creationalpatterns.factorymethodpattern;

/**
 * abstract class of factory
 */
public abstract class Creator {

    public Product create(String name){

        Product product;
        product = factoryMethod(name);
        product.created();
        return product;
    }

    abstract Product factoryMethod(String name);
}
