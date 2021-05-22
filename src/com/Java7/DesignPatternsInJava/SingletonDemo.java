package DesignPatternsInJava;

//File Name: SingletonDemo.java
public class SingletonDemo {

	public static void main(String[] args) {
		Singleton tmp = Singleton.getInstanceMethod();
		tmp.demoMethod();
	}
}