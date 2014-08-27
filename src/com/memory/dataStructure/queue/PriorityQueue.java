package com.memory.dataStructure.queue;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/27 16:02
 */
public class PriorityQueue {
    private int[] elements;
    private int cursor;
    private int size;
//    private int count;


    public PriorityQueue(int size) {
        this.size = size;
        this.elements = new int[size];
        this.cursor = -1;
    }

    public void enque(int data) {
        if (isFull()) {
            System.out.println("full queue");
            return;
        }
        if (cursor < 0) {
            elements[++cursor] = data;
        } else {
            int temp = cursor++;
            while (temp >= 0) {
                if (data > elements[temp]) {
                    elements[temp + 1] = elements[temp--];
                } else {
                    break;
                }
            }
            elements[temp + 1] = data;
        }
    }

    public int deque() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return 0;
        }
        return elements[cursor--];
    }

    public boolean isEmpty() {
        return cursor < 0;
    }

    public boolean isFull() {
        return size == cursor + 1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + "\t");
        }
        System.out.println();
    }
}
