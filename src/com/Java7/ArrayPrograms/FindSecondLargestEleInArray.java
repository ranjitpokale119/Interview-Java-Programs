package com.Java7.ArrayPrograms;

import java.util.Arrays;

public class FindSecondLargestEleInArray {

    public static void main(String[] args) {
        int arr[] = {41, 45, 43, 44, 46, 42};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int secondMax = arr[arr.length - 2];
        System.out.println("secondMax = " + secondMax);

    }
}