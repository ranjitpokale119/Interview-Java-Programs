package Java8Features;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("AB", "CD", "DE");
		//List<String> alpha = Arrays.asList("a", "b", "c", "d");
		System.out.println("\nUsing Method Reference in Java 8\n");

		//Traditional way --> java 7 way
		for (String s:lst){
			System.out.println(s);
		}
		//New way of printing using method reference
		lst.forEach(System.out::println);
	}

}
