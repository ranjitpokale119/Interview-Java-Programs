package com.Java8.methodReferences;

interface ParserNew {
	String parse(String s);
}

class StringParserNew {
	public static String convert(String s) {
		if (s.length() >= 6)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		return s;
	}

	public String convertNew(String s) {
		if (s.length() >= 6)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		return s;
	}

}

class MyPrinterNew {

	public void print(String str, ParserNew p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReference3 {

	public static void main(String[] args) {

		System.out.println("\nUsing Method Reference in Java 8\n");
		String str = "Junior NTR";

		MyPrinterNew mp = new MyPrinterNew();
		StringParserNew spn = new StringParserNew();

		 mp.print(str, (String s) -> StringParserNew.convert(s)); //we can do
		// like this also
		mp.print(str, StringParserNew::convert); // :: means you are passing
													// method convert to
													// StringParser
		mp.print(str, spn::convertNew); // without static method
	}

}
