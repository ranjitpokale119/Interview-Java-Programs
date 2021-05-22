package com.Java7.GeneralPrograms;

import java.util.HashMap;
import java.util.Map;

public class IntegerExample {
    public static void main(String[] args) {

        int[] randomNumber = {1, 2, 4, 1, 1, 2, 3, 4};

        Map<Integer, Integer> map1 = getEachIntegerCountUsingString(randomNumber);

        Map<Integer, Integer> map2 = getEachIntegerCount(randomNumber);
    }

    private static Map<Integer, Integer> getEachIntegerCountUsingString(int[] randomNumber) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < randomNumber.length - 1; i++) {
            for (int j = i + 1; j < randomNumber.length; j++) {
                if ((randomNumber[i] == randomNumber[j]) && (i != j)) {
                    System.out.println("Dup Element = " + randomNumber[j]);
                    if (integerIntegerMap.get(randomNumber[j]) == null)
                        integerIntegerMap.put(randomNumber[j], 1);
                    else
                        integerIntegerMap.put(randomNumber[j], integerIntegerMap.get(randomNumber[j]) + 1);
                } else {
                    integerIntegerMap.put(randomNumber[j], 1);
                }
            }
        }
        System.out.println("integerIntegerMap = " + integerIntegerMap);
        return integerIntegerMap;
    }

    private static Map<Integer, Integer> getEachIntegerCount(int[] randomNumber) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        System.out.println("integerIntegerMap = " + integerIntegerMap);
        return integerIntegerMap;
    }
}
