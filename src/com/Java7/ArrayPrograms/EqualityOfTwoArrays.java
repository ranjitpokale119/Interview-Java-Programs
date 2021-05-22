package com.Java7.ArrayPrograms;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static void main(String[] args) {
		String[] s1 = { "java", "j2ee", "struts", "hibernate" };

		String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };

		String[] s3 = { "java", "j2ee", "struts", "hibernate" };
		/*
		 * If you want to compare two arrays which have same number of elements
		 * and same set of elements but in different positions, then first sort
		 * both arrays using Arrays.sort() method and then compare using
		 * Arrays.equals() method.
		 */
		/*
		 * Arrays.sort(s1);
		 * 
		 * Arrays.sort(s2);
		 */
		
		//That's why use deepEquals() method to compare multidimensional arrays
		 System.out.println(Arrays.equals(s1, s2));        //Output : false
         

		System.out.println(Arrays.equals(s1, s2)); // Output : false

		System.out.println(Arrays.equals(s1, s3)); // Output : true
	}
}