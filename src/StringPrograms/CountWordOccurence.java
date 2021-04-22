package StringPrograms;

import java.util.HashMap;
import java.util.Map;
//Count occurrences of each word in given string 
public class CountWordOccurence {
	public static void main(String[] args) {

		String input = "This is java is a java";
		Map<String, String> map = new HashMap<String, String>();

			String[] word = input.split(" ");
			for (String str : word) {
				if (map.containsKey(str)) {
					int count = Integer.parseInt(map.get(str));
					map.put(str, String.valueOf(count + 1));
				} else {
					map.put(str, "1");
				}
			}

		System.out.println("Count :- " + map); // Output---Count :- {a=1, java=2, This=1, is=2}

	}
}
