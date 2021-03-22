package com.nareshnj.collection;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveElement {

    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("name1");
        names.add("naresh");
        names.add("name3");
        names.add("jagadale");
        names.add("name5");

        Map<Boolean, List<String>> map = names.stream().collect(Collectors.partitioningBy(name -> name.startsWith("name")));
        System.out.println(String.join(",", map.get(true)));
        System.out.println(String.join(",", map.get(false)));

        Integer i = Integer.valueOf(1);
        List<Integer> li = new ArrayList<>();
        li.add(i);
        Number n = i;

        System.out.println(Integer.compare(2, 4));
        System.out.println(Integer.compare(6, 4));
        System.out.println(Integer.compare(4, 4));

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(104,"Amit");
        hm.put(101,"Vijay");
        hm.put(99,"Rahul");
        hm.put(102,"Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
