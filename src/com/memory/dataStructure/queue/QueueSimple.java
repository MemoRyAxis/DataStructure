package com.memory.dataStructure.queue;

import com.memory.util.RandomUtil;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/27 14:40
 */
public class QueueSimple {
    private int[] elements;
    private int count;
    private int length;
    private int front;
    private int rear;

    public QueueSimple(int length) {
        this.length = length;
        this.elements = new int[length];
        this.count = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void enque(int data) throws Exception {
        if (isFull())
            throw new Exception("queue overflow");
        if (rear == length - 1)
            rear = -1;
        this.count++;
        this.elements[++rear] = data;
    }

    public int deque() throws Exception {
        if (isEmpty())
            throw new Exception("empty queue");
        if (front == length)
            front = 0;
        count--;
        return elements[front++];
    }

    public int peekFront() {
        return elements[front];
    }

    public int peekRear() {
        return elements[rear];
    }

    public int getLength() {
        return this.length;
    }

    public int getCount() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.length;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(elements[i] + "\t");
        }
        System.out.println();
    }
}

