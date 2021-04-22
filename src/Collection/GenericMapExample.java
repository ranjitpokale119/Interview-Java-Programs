package Collection;

import java.util.*;

class GenericMapExample {

	public static void main(String args[]) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Aswin");
		map.put(2, "Vijay");
		map.put(3, "Ashish");
		map.put(6, "Mayank");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
