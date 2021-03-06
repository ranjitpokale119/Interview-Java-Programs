package com.Java8.functionalInterface;

@FunctionalInterface
interface sayable1 {
	void say(String msg); // abstract method

	// It can contain any number of Object class methods.
	int hashCode();

	String toString();
}

public class FunctionalInterfaceExample2 implements sayable1 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
		
		fie.say("Hello there");
	}
}