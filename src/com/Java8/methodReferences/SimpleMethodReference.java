package com.Java8.methodReferences;

interface Sayable {
	void say();
}

public class SimpleMethodReference {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = SimpleMethodReference::saySomething;
		// Calling interface method
		sayable.say();
	}
}