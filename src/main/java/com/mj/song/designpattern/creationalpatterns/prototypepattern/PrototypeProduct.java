package com.mj.song.designpattern.creationalpatterns.prototypepattern;

public class PrototypeProduct implements Cloneable{

    private String name;

    private int age;

    public PrototypeProduct(){
        this.name = "name1";
        this.age = 10;
    }

    private PrototypeProduct(PrototypeProduct product){
        this.name = product.name;
        this.age = product.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //can return Object, but if that case need to cast the type
    @Override
    public PrototypeProduct clone(){
        return new PrototypeProduct(this);
    }
}
