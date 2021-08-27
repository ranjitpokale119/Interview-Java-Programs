package com.Java8.stream.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExampleWithObject {

    public static void main(String[] args) {

        List<Staff> staffs = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );


        //Before Java 8
        List<String> result = new ArrayList<>();
        for (Staff x : staffs) {
            result.add(x.getName());
        }
        System.out.println(result); //[mkyong, jack, lawrence]

        //Java 8
        List<String> collect = staffs.stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
        System.out.println(collect); //[mkyong, jack, lawrence]

    }

}