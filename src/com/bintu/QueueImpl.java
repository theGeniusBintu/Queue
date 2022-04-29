package com.bintu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueueImpl implements Queue {

    Integer front;
    LinkedList <Integer> queue = new LinkedList<>() {
    };


    @Override
    public void enqueue(int newItem) {
        queue.add(newItem);
    }

    @Override
    public Integer dequeue() {
        if (queue.size() > 0)
            front = queue.remove(0);
        return front;
    }

    @Override
    public Integer peek() {
        if (queue.size() > 0)
            front = queue.get(0);
        return front;
    }

    @Override
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    @Override
    public Integer getSize() {
        return queue.size();
    }
}
