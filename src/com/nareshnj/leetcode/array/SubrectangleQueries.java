package com.nareshnj.leetcode.array;

public class SubrectangleQueries {
    public static void main(String[] args) {
        int[][] rectangle = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
        SubrectangleQueries obj = new SubrectangleQueries(rectangle);
        obj.updateSubrectangle(0,0,3,2,5);
        for(int i=0; i<rectangle.length; i++) {
            for(int j=0; j<rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + "   ");
            }
            System.out.println("");
        }
        int param_2 = obj.getValue(0,2);
        System.out.println(param_2);
    }

    private int[][] rectangle;
    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1; i< row2+1; i++) {
            for(int j=col1; j<col2+1; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
