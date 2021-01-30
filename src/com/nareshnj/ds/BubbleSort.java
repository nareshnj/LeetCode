package com.nareshnj.ds;

/*
* in-place algorithm
* O(n2) time complexity
* */
public class BubbleSort {

    public static void main(String[] args) {
        int[] unsorted = {20, -15, 7, 35, -22, 1, 55};
        int[] sorted = bubbleSort(unsorted);
        for (int i : sorted) {
            System.out.println(i);
        }
    }

    private static int[] bubbleSort(int[] unsorted) {
        int unsortedIndex = unsorted.length-1;
        for(int i=0; i<unsorted.length; i++) {
            for(int j=0; j<unsortedIndex; j++) {
                if (unsorted[j] > unsorted[j+1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j+1] = temp;
                }
            }
        }
        return unsorted;
    }
}
