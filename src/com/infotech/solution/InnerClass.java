package com.infotech.solution;

import java.beans.Transient;

public class InnerClass {

	int a;

	void get() {
		System.out.println("get");
	}
	//abstract strictfp synchronized Transient default these modifiers only applied to method
	//volatile modifier is only used for variables
	
	 private class B {
		void show() {
			class aba{// Local inner class
				void putdata(){}
			}
			System.out.println("Showww");
		}
	}

	public static void main(String[] args) {
		InnerClass a = new InnerClass();
		B b = a.new B();
		b.show();
		a.get();
	}
}
