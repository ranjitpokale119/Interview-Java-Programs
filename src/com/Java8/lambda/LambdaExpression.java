package com.Java8.lambda;

interface A {
	void show(int i);
}

/*
 * class Test implements SingletonExample1 {
 * 
 * @Override public void show() { System.out.println("Hello"); }
 * 
 * }
 */

public class LambdaExpression {

	public static void main(String[] args) {

		A aRef;

		/*
		 * aRef= new SingletonExample1() {//This is inner class with no class name so it is
		 * called anonymous
		 * 
		 * @Override public void show(int i ) { System.out.println("Hello "+i);
		 * }
		 * 
		 * };
		 */
		aRef = i -> System.out.println("sasa " + i);// Consumer Interface

		aRef.show(8);
	}

}
