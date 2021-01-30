package com.nareshnj.ds;

//instead of swapping everytime like bubble sort, save largest element index in variable and swap after for loop
public class SelectionSort {

    public static void main(String[] args) {
        int[] unsorted = {20, -15, 7, 35, -22, 1, 55};
        int[] sorted = selectionSort(unsorted);
        for (int i : sorted) {
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] unsorted) {
        int unsortedIndex = unsorted.length-1;
        for(int i=0; i<unsorted.length; i++) {
            int largestIndex = 0;
            for(int j=0; j<unsortedIndex; j++) {
                if (unsorted[j] > unsorted[j+1]) {
                    largestIndex = j;
                }
            }
            int temp = unsorted[largestIndex];
            unsorted[largestIndex] = unsorted[unsortedIndex];
            unsorted[unsortedIndex] = temp;
            unsortedIndex--;
        }
        return unsorted;
    }
}
