package com.nareshnj.leetcode.array;

import java.util.Arrays;

public class DeepEquals {

    public static void main(String[] args) {

        DeepEquals deepEquals = new DeepEquals();
        Employee employee = deepEquals.createEmployee();
        Employee employee2 = deepEquals.createEmployee();
        Employee[] e1Array = {employee};
        Employee[] e2Array = {employee2};

        System.out.println(Arrays.deepEquals(e1Array, e2Array));
    }


    Employee createEmployee() {
        return new Employee("naresh", 30);
    }


    class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
