package com.nareshnj.leetcode.array;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] wealths = {{1, 2, 4}, {2, 1, 7}};
        System.out.println(maximumWealth(wealths));
    }

    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i=0; i< accounts.length; i++) {
            int currentWealth = 0;
            for(int j=0; j< accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            if(currentWealth > wealth) {
                wealth = currentWealth;
            }
        }
        return wealth;
    }
}
