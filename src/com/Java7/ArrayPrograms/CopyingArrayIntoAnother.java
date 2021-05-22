package com.Java7.ArrayPrograms;

public class CopyingArrayIntoAnother {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] a = new int[10];

		int[] b = new int[100];

		a = b; // Compiler checks only type, not the size
	}
	
	/*
	 * What are the different ways of copying an array into another array?
	 * 
	 * There are four methods available in java to copy an array.
	 * 
	 * 1) Using for loop
	 * 
	 * 2) Using Arrays.copyOf() method
	 * 
	 * 3) Using System.arraycopy() method
	 * 
	 * 4) Using clone() method
	 */
}
