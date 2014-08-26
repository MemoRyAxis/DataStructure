package com.memory.algorithm.array;

import com.memory.util.ArrayUtil;
import com.memory.util.RandomUtil;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/21 16:41
 */
public class ArraySort {

    /**
     * generate array
     *
     * @param length array's length
     * @param start  min random integer
     * @param end    max random integer
     * @return
     */
    public static int[] generateArray(int length, int start, int end) {
        if (length <= 0) {
            return new int[]{};
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = RandomUtil.randomIntBetween(start, end);
        }
        return arr;
    }

    /**
     * generate sorted array
     */
    public static int[] generateSortedArray(int length) {
        if (length <= 0) {
            return new int[]{};
        }
        int[] arr = new int[length];
        int data = 1;
        for (int i = 0; i < length; i++) {
            arr[i] = data++;
//            data += RandomUtil.randomIntIn(3);
        }
        return arr;
    }

    /**
     * swap two element in array
     */
    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    /**
     * bubble sort
     */
    public static int[] bubbleSort(int[] arr) {
        int swapCount = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    ArraySort.swap(arr, i, j);
                    swapCount++;
                }
            }
        }
        System.out.println("swap count(bubble sort): " + swapCount);
        return arr;
    }

    /**
     * select sort
     */
    public static int[] selectSort(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            if (temp != i) {
                ArraySort.swap(arr, temp, i);
                swapCount++;
            }
        }
        System.out.println("swap count(select sort): " + swapCount);
        return arr;
    }

    /**
     * insert sort
     * <p/>
     * the most stable sort algorithm
     * <p/>
     * times of comparing equals times of swap
     * <p/>
     * two times as fast as bubble sort
     * <p/>
     * a little faster than select sort
     */
    public static int[] insertSort(int[] arr) {
        int swapCount = 0;
        for (int i = 1; i < arr.length; i++) {
            int cursor = i;
            while (cursor > 0 && arr[cursor - 1] > arr[cursor]) {
                swap(arr, cursor--, cursor);
                swapCount++;
            }
        }
        System.out.println("swap count(insert sort): " + swapCount);
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = ArraySort.generateSortedArray(50);
        ArrayUtil.print(arr);
        ArrayUtil.binarySearch(arr, 13);

        int[] arrr = ArraySort.generateArray(50, 1000, 2000);
        ArrayUtil.print(ArraySort.selectSort(arrr));

        int[] arrrr = ArraySort.generateArray(50, 1000, 2000);
        ArrayUtil.print(ArraySort.bubbleSort(arrrr));

        int[] arrrrr = ArraySort.generateArray(50, 1000, 2000);
        ArrayUtil.print(ArraySort.insertSort(arrrrr));
    }
}
