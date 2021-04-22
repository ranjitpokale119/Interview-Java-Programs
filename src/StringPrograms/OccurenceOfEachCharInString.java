package StringPrograms;

import java.util.HashMap;

public class OccurenceOfEachCharInString {
	public static void main(String[] args) {
		String str = "rrnjaaj";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}

//Output --------{a=2, r=2, j=2, n=1}
