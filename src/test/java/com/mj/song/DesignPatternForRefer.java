package com.mj.song;

import com.mj.song.designpattern.behavioralpatterns.observerpattern.Observable;
import com.mj.song.designpattern.behavioralpatterns.observerpattern.ObservableProduct;
import com.mj.song.designpattern.behavioralpatterns.observerpattern.ObserverProduct;
import com.mj.song.designpattern.creationalpatterns.builderpattern.BuilderProduct;
import com.mj.song.designpattern.creationalpatterns.factorymethodpattern.*;
import com.mj.song.designpattern.creationalpatterns.prototypepattern.MutablePrototypeProduct;
import com.mj.song.designpattern.creationalpatterns.prototypepattern.PrototypeProduct;
import com.mj.song.designpattern.structuralpatterns.proxypattern.ProxySubject;
import com.mj.song.designpattern.structuralpatterns.proxypattern.Subject;
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

        Assertions.assertEquals(ConcreteCreatorA.class, creatorA.getClass());
        Assertions.assertEquals(ConcreteCreatorB.class, creatorB.getClass());
        Assertions.assertEquals(ConcreteProductA.class, productAFromA.getClass());
        Assertions.assertEquals(ConcreteProductB.class, productBFromA.getClass());
        Assertions.assertEquals(ConcreteProductA.class, productAFromB.getClass());
        Assertions.assertEquals(ConcreteProductB.class, productBFromB.getClass());
    }

    @Test
    void builderPatternExample(){
        BuilderProduct bp = BuilderProduct.builder().name("name").age("123").build();
        Assertions.assertEquals("name", bp.getName());
        Assertions.assertEquals("123", bp.getAge());
        Assertions.assertNull(bp.getGender());
    }

    @Test
    void prototypePatternExample() throws CloneNotSupportedException{
        PrototypeProduct product = new PrototypeProduct();
        Assertions.assertEquals("name1", product.getName());
        Assertions.assertEquals(10, product.getAge());

        //deep copy (= create new Object)
        PrototypeProduct deepCopy = product.clone();
        Assertions.assertNotEquals(product, deepCopy);
        deepCopy.setAge(100);
        Assertions.assertEquals(10, product.getAge());
        Assertions.assertEquals(100, deepCopy.getAge());

        //shallow copy(= copy reference of original Object)
        PrototypeProduct shallowCopy = product;
        Assertions.assertEquals(product, shallowCopy);
        shallowCopy.setAge(100);
        Assertions.assertEquals(100, product.getAge());

        //create object that including mutable object
        MutablePrototypeProduct p = new MutablePrototypeProduct();
        p.loadData();
        Assertions.assertEquals("names", p.getName());
        Assertions.assertEquals(10, p.getList().size());

        //when i called super.clone() of cloneable, mutable obj (ex: list, map..) have copied reference.
        //it might be affect to original obj.
        MutablePrototypeProduct superClone = (MutablePrototypeProduct)p.superClone();

        //if want to each mutable obj, need to handle that in your hand
        MutablePrototypeProduct clone = p.clone();

        superClone.getList().remove(0);
        Assertions.assertEquals(p.getList(), superClone.getList());

        clone.getList().remove(1);
        Assertions.assertNotEquals(p.getList(), clone.getList());

        Assertions.assertNotEquals(superClone.getList(), clone.getList());
        Assertions.assertEquals(p.getList(), superClone.getList());

        /* list test
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        System.out.println("create same empty list");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());

        list.add("q");
        list2.add("w");
        System.out.println("store diff value to each");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());

        list2.remove(0);
        System.out.println("remove value from list2");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());

        list2.add("q");
        System.out.println("store same value to list2");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());


        list.add("1");
        System.out.println("store value to only list1");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());

        list2.add("1");
        System.out.println("store same value to list2");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());

        list.add("2");
        list2.add("2");
        System.out.println("store same value to each");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());

        list.add("a");
        list2.add("b");
        System.out.println("store different value to each");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list2.getClass().getName() + "@" + list2.hashCode());

        List<String> list3 = list;
        System.out.println("create new list3");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list3.getClass().getName() + "@" + list2.hashCode());

        list3.remove(0);
        System.out.println("remove 0 from list3");
        System.out.println(list.getClass().getName() + "@" + list.hashCode());
        System.out.println(list3.getClass().getName() + "@" + list2.hashCode());

        System.out.println("is it diff?");
        System.out.println(list);
        System.out.println(list3);
        */
    }

    @Test
    void observerPatternExample(){
        // the observer pattern is a software design pattern in which an object, named the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
        Observable observable = new ObservableProduct();
        ObserverProduct observer = new ObserverProduct();
        observable.addObserver(observer);
        observable.notifyObserver("something");
        Assertions.assertEquals(observer.getSomething(), "something");
    }

    @Test
    void proxyPatternExample(){
        Subject s = new ProxySubject();
        Assertions.assertEquals("proxy subject", s.methodThatNoNeedHugeResource());
        Assertions.assertEquals("real subject", s.methodThatNeedHugeResource());
    }
}
