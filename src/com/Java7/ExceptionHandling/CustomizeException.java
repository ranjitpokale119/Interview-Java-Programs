package com.Java7.ExceptionHandling;

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String s) {
		super(s);
	}
}

public class CustomizeException {

	static void validateAge(int age) throws InvalidAgeException {
		if (age > 18) {
			System.out.println("Valid Age");
			System.out.flush(); 
		} else {
			throw new InvalidAgeException("Invalid Age");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(54);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}