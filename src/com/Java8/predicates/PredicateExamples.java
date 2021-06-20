package com.Java8.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExamples {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 10);

        //print all numbers from list those are greater than given number
        List<Integer> result = list.stream().filter(n -> n > 5).collect(Collectors.toList());
        System.out.println("result = " + result);

        // multiple filters
        List<Integer> collect = list.stream()
                .filter(x -> x > 5 && x < 8).collect(Collectors.toList());

        System.out.println("multiple filters =" + collect);

        long count = list.stream().filter(x -> x > 5).count();
        System.out.println("count = " + count);

        List<Integer> disIntegers = list.stream().filter(x -> x > 5).distinct().collect(Collectors.toList());;
        System.out.println("disIntegers = " + disIntegers);

    }
}