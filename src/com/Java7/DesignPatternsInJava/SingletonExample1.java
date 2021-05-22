package DesignPatternsInJava;

class SingletonExample1 {
	private static SingletonExample1 obj = new SingletonExample1();//static member .. Early, instance will be created at load
									// time

	private SingletonExample1() {// private constructor
	}

	public static SingletonExample1 getSingletonExample1() {//static factory method
		return obj;
	}

	public void doSomething() {
	System.out.println("sas");
	}
}