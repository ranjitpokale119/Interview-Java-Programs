package Java8Features;

import java.util.Arrays;
import java.util.List;

interface Parser {
	String parse(String s);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() >= 6)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		return s;
	}
}

class MyPrinter {

	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReference2 {

	public static void main(String[] args) {

		System.out.println("\nUsing Method Reference in Java 8\n");
		String str = "Junior NTR";

		MyPrinter mp = new MyPrinter();

		mp.print(str, new Parser() {

			@Override
			public String parse(String s) {
				return StringParser.convert(s);
			}

		});

	}

}
