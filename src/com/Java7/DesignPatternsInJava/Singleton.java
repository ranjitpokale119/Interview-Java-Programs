package DesignPatternsInJava;

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
