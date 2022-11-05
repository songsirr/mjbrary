package com.mj.song.designpattern.creationalpatterns.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class MutablePrototypeProduct implements Cloneable{

    private String name;

    private List<String> list = new ArrayList<>();

    public MutablePrototypeProduct() {
    }

    public void loadData(){
        this.name = "names";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add("something" + i);
        }
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    //custom clone()
    public MutablePrototypeProduct clone() {
        MutablePrototypeProduct p = new MutablePrototypeProduct();
        p.setName(this.getName());
        for (String s : this.getList()){
            p.getList().add(s);
        }
        return p;
    }

    //custom clone()
    public Object superClone() throws CloneNotSupportedException {
        return super.clone();
    }
}
