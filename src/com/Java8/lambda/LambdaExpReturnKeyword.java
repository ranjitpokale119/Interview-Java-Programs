package com.Java8.lambda;

interface AddableTest {
	int add(int a, int b);
	default void show() {
		System.out.println("defalut method in interface  ");
	}
}

public class LambdaExpReturnKeyword {
	public static void main(String[] args) {

		// Lambda expression without return keyword.
		AddableTest ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));
		

		// Lambda expression with return keyword.
		AddableTest ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
	}
}