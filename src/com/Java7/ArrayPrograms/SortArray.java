package com.Java7.ArrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortArray {
    public static void main(String[] args) {
        int[] a = new int[]{45, 12, 78, 34, 89, 21};
        int[] b = new int[]{45, 12, 78, 34, 89, 21};
        sortArrayUsingJava7(a);
        sortArrayUsingJava8(b);
    }

    private static void sortArrayUsingJava8(int[] b) {
        List<Integer> collect = Arrays.stream(b).sorted().boxed().collect(Collectors.toList());
        System.out.println("sorted = " + collect);
    }

    private static void sortArrayUsingJava7(int[] a) {
        Arrays.sort(a);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }
}