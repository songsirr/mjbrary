package com.mj.song;

import com.mj.song.designpattern.builderpattern.BuilderProduct;
import com.mj.song.designpattern.factorymethodpattern.ConcreteCreatorA;
import com.mj.song.designpattern.factorymethodpattern.ConcreteCreatorB;
import com.mj.song.designpattern.factorymethodpattern.Creator;
import com.mj.song.designpattern.factorymethodpattern.Product;
import org.junit.jupiter.api.Test;

class DesignPatternForRefer {

    @Test
    void factoryMethodPatternExample(){
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        Product productAFromA = creatorA.create("A");
        Product productBFromA = creatorA.create("B");
        Product productAFromB = creatorB.create("A");
        Product productBFromB = creatorB.create("B");
    }

    @Test
    void builderPatternExample(){
        BuilderProduct bp = BuilderProduct.builder().name("name").age("123").build();
    }
}
