package ExceptionHandling;

public class MySingleTon {

	private MySingleTon() {
		System.out.println("In constructor ");
	}
	private MySingleTon(int a) {
		System.out.println("In constructor 2");
	}


	{
		System.out.println("simple block");
	}
	
	static {
		int a = 10;
		System.out.println("In static method " + a);
	}

	public void getSomeThing() {
		// do something here
		System.out.println(
				"In getSomeThing Class Method  : Line Number" + new Exception().getStackTrace()[0].getLineNumber());
	}

	public static void main(String a[]) {

		System.out.println("In Main Method ");
		MySingleTon st = new MySingleTon(2);
		st.getSomeThing();
		System.out.println(st.getClass());
	}
}
