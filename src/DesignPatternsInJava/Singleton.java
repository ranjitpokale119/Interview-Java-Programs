package DesignPatternsInJava;
/*
* Implementation of Singleton Class
There are several ways to implement or design a Singleton class. The following are some popular methods by which we can design a Singleton class:

1. Eager Initialization Method
2. Lazy Initialization Method
3. Thread Safe Singleton Method
4. Lazy Initialization with Double Lock Method
5. Lazy Load Method
6. Static Block Initialization Method
7. Bill Pugh Implementation Method
*
* */
//File Name: Singleton.java
public class Singleton {

	private static Singleton singleton = new Singleton();
	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private Singleton() {
	}

	/* Static 'instance' method */
	public static Singleton getInstanceMethod() {
		return singleton;
	}

	/* Other methods protected by singleton-ness */
	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}
}
// Here is the main program file where we will create a singleton object −
