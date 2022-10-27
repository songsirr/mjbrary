package com.mj.song.graph;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T value;

    private List<Node<T>> adjacency;

    private Node(T value){
        this.value = value;
        this.adjacency = new ArrayList<>();
    }
}
