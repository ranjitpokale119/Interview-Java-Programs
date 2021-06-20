package com.Java8.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringList {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "abc");

        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));

        System.out.println("Merged String: " + mergedString);

        int count = (int) Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i < 4) // Intermediate Operation filter
                .count();  //Couting
        System.out.println("count = " + count);

        List<Integer> count1 = Stream.of(1, 2, 2, 1, 3, 4, 5)
                .filter(i -> i < 4) // Intermediate Operation filter
                .distinct() //Finding Distinct list elements
                .collect(Collectors.toList());

        System.out.println("count1 = " + count1);

        List<String> diStrings1 = strings.stream()
                .distinct() //Finding Distinct list elements
                .collect(Collectors.toList());

        System.out.println("diStrings1 = " + diStrings1);
    }
}
