package com.memory.util;

import java.util.UUID;

/**
 * @author MemoRyAxis
 * @todo random
 * @date 2014/8/26 9:54
 */
public class RandomUtil {

    /**
     * 32GUID
     */
    public static String GUID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    /**
     * generate random integer in [0, limit)
     */
    public static int randomIntIn(int limit) {
        return (int) (Math.random() * limit);
    }

    /**
     * generate random integer in [start, end)
     */
    public static int randomIntBetween(int start, int end) {
        return (int) (Math.random() * (end - start)) + start;
    }

    public static void main(String[] args) {
        System.out.println(RandomUtil.GUID());

        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 100000; i++) {
//            int temp = RandomUtil.randomIntIn(100);
            int temp = RandomUtil.randomIntBetween(1, 101);
            max = temp > max ? temp : max;
            min = temp < min ? temp : min;
            if (temp == 100) {
                count ++;
            }
        }
        System.out.println(count);
        System.out.println(min);
        System.out.println(max);
    }
}
