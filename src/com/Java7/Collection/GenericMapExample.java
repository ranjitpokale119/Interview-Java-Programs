package com.Java7.Collection;

import java.util.*;

class GenericMapExample {

    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Aswin");
        map.put(2, "Vijay");
        map.put(3, "Ashish");
        map.put(6, "Mayank");
        map.put(6, "Mayank2"); //if the key is same it will overrite the value

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(map.keySet());
        System.out.println("-----------1----");
        System.out.println(map.values());
        System.out.println("--------------2-");
        for (String s : map.values()) {
            System.out.println(s);
        }

    }
}
