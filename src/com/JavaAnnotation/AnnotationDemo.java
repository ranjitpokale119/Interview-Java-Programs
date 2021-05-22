package com.JavaAnnotation;

import java.util.ArrayList;

class A {
	public void show() {
		System.out.println("In A");
	}
}

class B extends A {
	
	@Deprecated
	public void getData(){
	}
	@SuppressWarnings("rawtypes")
	@Override
	public void show() {
		ArrayList al=new ArrayList();
		System.out.println("In B");
	}
}

public class AnnotationDemo {
	public static void main(String[] args) {

		/*
		 * A a = new A(); a.show();
		 */

		B b = new B();
		b.show();
		b.getData();

	}
}
