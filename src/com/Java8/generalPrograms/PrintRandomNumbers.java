package com.Java8.generalPrograms;

import java.util.Random;

//How do you print ten random numbers using forEach?
public class PrintRandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Printing 10 random numbers ");
        random.ints().limit(10).forEach(System.out::println);
    }

}
