package com.memory.util;

/**
 * @author MemoRyAxis
 * @todo array
 * @date 2014/8/26 10:21
 */
public class ArrayUtil {

    /**
     * print int array
     */
    public static void print(int[] arr) {
        if (arr == null || arr.length < 1) {
            System.out.println("array is null");
        }
//        System.out.println("arr.len : " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
//            if ((i + 1) % 20 == 0)
//                System.out.println();
        }
        System.out.println();
    }

    /**
     * binary search
     */
    public static void binarySearch(int[] arr, int data) {
        if (arr.length < 1) {
            System.out.println("null?");
            return;
        }
        if (arr.length == 1) {
            if (data == arr[0]) {
                System.out.println("success.\t" + data + " -> arr[0]");
                return;
            } else {
                System.out.println("not in.");
                return;
            }
        }
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            int mid = (left + right) >> 2;
            if (data == arr[mid]) {
                System.out.println("success.\r" + data + " -> arr[" + mid + "]");
                return;
            }
            if (data < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("not in.");
        return;
    }

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
                    ArrayUtil.swap(arr, i, j);
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
                ArrayUtil.swap(arr, temp, i);
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
}
