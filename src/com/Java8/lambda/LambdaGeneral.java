package com.Java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaGeneral {
    public static void main(String[] args) {
        int number = 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 10);
        list.forEach(x -> {
            //number = x;//this will give compile time error as we can not use/assign external variable in consumer interface
            //instead we can declare variable inside lambda expression
            System.out.println("x = " + x);
            System.out.println("number = " + number);
        });
    }
}
