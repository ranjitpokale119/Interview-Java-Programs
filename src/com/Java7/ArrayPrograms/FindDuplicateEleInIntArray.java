package com.Java7.ArrayPrograms;

//FindDuplicateEleInIntArray
public class FindDuplicateEleInIntArray {
    public static void main(String[] args) {
        int[] my_array = {1, 1, 5, 5, 4, 6, 7, 2, 6};

        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i] == my_array[j]) && (i != j)) {
                    System.out.println("Duplicate Element is : " + my_array[j]);

                }
            }
        }
    }
}