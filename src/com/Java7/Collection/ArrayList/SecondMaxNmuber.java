package com.Java7.Collection.ArrayList;

import java.util.*;

public class SecondMaxNmuber {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 13, 55, 18, 43, 16);
        Collections.sort(integerList);
        System.out.println("integerList = " + integerList.get(integerList.size() - 2));


    }
}
