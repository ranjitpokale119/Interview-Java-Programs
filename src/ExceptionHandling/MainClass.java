package ExceptionHandling;

class test {

	static int i = 1111;

	static {
		System.out.println("static");
		i = i-- - --i;
	}
	{
		System.out.println("context");
		i = i++ + ++i;
	}

}

class B extends test {
	static {
		System.out.println("static b");
		i = --i - i--;
	}
	{
		System.out.println("instance ii");
		i = ++i + i++;
	}
}

public class MainClass {

	public static void main(String[] args) {
		B b = new B();
		
		
		String s=new String("test");
		String s1;
		
		
		System.out.println(b.i);
	}

}