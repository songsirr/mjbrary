package com.mj.song;

import com.mj.song.designpattern.creationalpatterns.builderpattern.BuilderProduct;
import com.mj.song.designpattern.creationalpatterns.factorymethodpattern.ConcreteCreatorA;
import com.mj.song.designpattern.creationalpatterns.factorymethodpattern.ConcreteCreatorB;
import com.mj.song.designpattern.creationalpatterns.factorymethodpattern.Creator;
import com.mj.song.designpattern.creationalpatterns.factorymethodpattern.Product;
import com.mj.song.designpattern.creationalpatterns.prototypepattern.PrototypeProduct;
import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals("name", bp.getName());
        Assertions.assertEquals("123", bp.getAge());
        Assertions.assertNull(bp.getGender());
    }

    @Test
    void prototypePatternExample(){
        PrototypeProduct product = new PrototypeProduct();
        Assertions.assertEquals("name1", product.getName());
        Assertions.assertEquals(10, product.getAge());

        //deep copy (= create new Object)
        PrototypeProduct deepCopy = product.clone();
        Assertions.assertNotEquals(product, deepCopy);
        deepCopy.setAge(100);
        Assertions.assertEquals(10, product.getAge());
        Assertions.assertEquals(100, deepCopy.getAge());

        //shallow copy(= copy reference of original object)
        PrototypeProduct shallowCopy = product;
        Assertions.assertEquals(product, shallowCopy);
        shallowCopy.setAge(100);
        Assertions.assertEquals(100, product.getAge());
    }
}
