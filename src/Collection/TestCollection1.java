package Collection;

import java.util.ArrayList;

class TestCollection1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		// Traversing list through Iterator
		for (String obj : list) {
			System.out.println(obj);
		}
		list.forEach(System.out::println);
	}
}
