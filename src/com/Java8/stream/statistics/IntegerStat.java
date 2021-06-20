package com.Java8.stream.statistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class IntegerStat {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("stats = " + stats);
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getCount() = " + stats.getCount());
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getSum() = " + stats.getSum());

    }
}
