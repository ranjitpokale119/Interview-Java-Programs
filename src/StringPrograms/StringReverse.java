package StringPrograms;

public class StringReverse {
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(StringReverse.reverseString("my name is khan"));
		System.out.println(StringReverse.reverseString("I am sonoo jaiswal"));
	}
}