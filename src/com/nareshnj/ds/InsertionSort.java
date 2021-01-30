package com.nareshnj.ds;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsorted = {20, -15, 7, 35, -22, 1, 55, 2};
        int[] sorted = insertionSort(unsorted);
        for (int i : sorted) {
            System.out.println(i);
        }
    }

    private static int[] insertionSort(int[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {
            int tmp = unsorted[i];
            int j;
            for (j = i; j > 0 && unsorted[j - 1] > tmp; j--) {
                unsorted[j] = unsorted[j - 1];
            }
            unsorted[j] = tmp;

        }
        return unsorted;
    }

}
