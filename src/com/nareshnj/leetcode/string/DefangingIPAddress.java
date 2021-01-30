package com.nareshnj.leetcode.string;

public class DefangingIPAddress {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<address.length(); i++) {
            if(address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
