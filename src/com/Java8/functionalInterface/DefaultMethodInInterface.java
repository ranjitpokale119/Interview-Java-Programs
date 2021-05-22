package com.Java8.functionalInterface;

@FunctionalInterface
interface interfaceD {
	void show(int i);

	static void showHash() {
		// we can add static body as well in interface we can't override it
		System.out.println("In the body of satic method of interface ");
	}

	default void putData() {
		System.out.println("In the body of default method of interface ");
		// we can add default method as well in interface and provide it's impl and we can override it
	}
}

public class DefaultMethodInInterface {

	public static void main(String[] args) {

		interfaceD id = new interfaceD() {

			@Override
			public void show(int i) {
			}

			@Override
			public void putData() {
				System.out.println("In overriden default method of interface ");
			}

		};
		id.putData();
	}

}
