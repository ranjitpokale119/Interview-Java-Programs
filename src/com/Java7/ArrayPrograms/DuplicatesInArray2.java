package com.Java7.ArrayPrograms;
//Java Program To Find Duplicate Elements In An Array Using HashSet 
import java.util.HashSet;

public class DuplicatesInArray2 {
	public static void main(String[] args) {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : strArray) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}
}