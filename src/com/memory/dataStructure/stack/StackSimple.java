package com.memory.dataStructure.stack;

import com.memory.util.RandomUtil;

/**
 * @author MemoRyAxis
 * @todo stack
 * @date 2014/8/27 9:24
 */
public class StackSimple {

    private int[] elements;
    private int max;
    private int cursor;

    public StackSimple(int max) {
        this.elements = new int[max];
        this.max = max;
        this.cursor = -1;
    }

    public void push(int data) throws Exception {
        if (isFull())
            throw new Exception("stack overflow!");
        this.elements[++cursor] = data;
    }

    public int pop() throws Exception {
        if (isEmpty())
            throw new Exception("empty stack!");
        return this.elements[cursor--];
    }

    public int peek() throws Exception {
        if (isEmpty())
            throw new Exception("empty stack!");
        return elements[cursor];
    }

    public boolean isEmpty() {
        return cursor == -1;
    }

    public boolean isFull() {
        return cursor == max - 1;
    }
}

class StackTest {
    public static void main(String[] args) throws Exception {
        StackSimple stack = new StackSimple(10);

        for (int i = 0; i < 10; i++) {
            int temp = RandomUtil.randomIntBetween(1000, 2000);
            System.out.println(temp);
            stack.push(temp);
            System.out.println(stack.peek());
        }

        for (int i = 0; i < 10; i++) {
            stack.pop();
            System.out.println(stack.isEmpty());
        }

    }
}
