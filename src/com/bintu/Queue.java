package com.bintu;

public interface Queue {

    void enqueue(int newItem);

    Integer dequeue();

    Integer peek();

    boolean isEmpty();

    Integer getSize();
}
