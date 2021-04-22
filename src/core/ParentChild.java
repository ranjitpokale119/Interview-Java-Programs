package core;

class Parent {

	void show() {
		System.out.println("P");
	}

	void show1() {
		System.out.println("C");
	}
}

class Child extends Parent {

	public void show() {
		System.out.println("cs");
	}
}

public class ParentChild {
	public static void main(String[] args) {
		//Child c1 = (Child) new Parent();
		Parent p=new Child();
		p.show();
		/*
		 * p.show(); c.show(); p1.show();
		 */
		//c1.show();
	}

}