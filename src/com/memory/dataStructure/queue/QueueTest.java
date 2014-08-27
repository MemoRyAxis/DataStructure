package com.memory.dataStructure.queue;

import com.memory.util.RandomUtil;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/27 16:19
 */
class QueueTest {
    public static void main(String[] args) throws Exception {
        /*
        QueueSimple queue = new QueueSimple(10);
        System.out.println(queue.isEmpty());

        queue.enque(RandomUtil.randomIntIn(10000));
        System.out.println(queue.peekFront());
        System.out.println(queue.peekRear());
        System.out.println(queue.getCount());

        queue.enque(RandomUtil.randomIntIn(10000));
        System.out.println(queue.peekFront());
        System.out.println(queue.peekRear());
        System.out.println(queue.getCount());

        System.out.println(queue.deque());
        System.out.println(queue.deque());

        for (int i = 0; i < 10; i++) {
            queue.enque(RandomUtil.randomIntIn(10000));
            queue.print();
        }

        System.out.println(queue.isFull());
        */

        PriorityQueue pq = new PriorityQueue(10);
        System.out.println(pq.isEmpty());
        System.out.println(pq.isFull());
        for (int i = 0; i < 10; i++) {
            int temp = RandomUtil.randomIntIn(10000);
            pq.enque(temp);
            System.out.print(temp + " -> ");
            pq.print();
        }
    }
}
