package com.nareshnj.leetcode.array;

public class SortDiagonalMatrix {
    public static void main(String[] args) {
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        print(mat);
        System.out.println("---------------------------------------");
        int[][] result = diagonalSort(mat);
        print(result);
    }

    public static int[][] diagonalSort(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];

        for(int i =mat.length,j=0; i<-1 || j>mat[0].length; ) {
            System.out.println(mat[i][j]);
            if (i > -1) {
                i--;

            }
        }

        return result;
    }

    public static void print(int[][] rectangle) {
        for(int i=0; i<rectangle.length; i++) {
            for(int j=0; j<rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}
