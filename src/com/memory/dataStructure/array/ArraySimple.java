package com.memory.dataStructure.array;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/26 16:12
 */
public class ArraySimple {
    private int arr;
    private int len;

    public void insert() {

    }

    public void remove() {

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
}
