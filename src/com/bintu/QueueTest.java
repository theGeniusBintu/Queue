package com.bintu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class QueueTest {
    @Test
    void checkQueue() {
        QueueImpl isEmptyTest = new QueueImpl();

        boolean expected = true;
        boolean actual = isEmptyTest.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    void checkQueueWithElements() {
        QueueImpl queueHasElements = new QueueImpl();
        queueHasElements.enqueue(1);

        boolean actual = queueHasElements.isEmpty();
        boolean expected = false;

        assertEquals(actual, expected);
    }

    @Test
    void removeItemAtFront() {
        QueueImpl removeFrontElement = new QueueImpl();
        removeFrontElement.enqueue(1);
        removeFrontElement.enqueue(2);
        removeFrontElement.enqueue(3);

        List<Integer> queue = new ArrayList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        Integer expected = queue.remove(0);
        Integer actual = removeFrontElement.dequeue();

        assertEquals(expected, actual);
    }

    @Test
    void firstNumberInList() {
        QueueImpl getFrontElement = new QueueImpl();
        getFrontElement.enqueue(1);
        getFrontElement.enqueue(2);
        getFrontElement.enqueue(3);

        List<Integer> queue = new ArrayList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        Integer expected = queue.get(0);
        Integer actual = getFrontElement.peek();

        assertEquals(expected, actual);
    }

    @Test
    void checkQueueForSize() {
        QueueImpl element = new QueueImpl();
        element.enqueue(1);
        element.enqueue(2);
        element.enqueue(3);

        List<Integer> queue = new ArrayList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        Integer expected = queue.size();
        Integer actual = element.getSize();

        assertEquals(expected, actual);
    }
}