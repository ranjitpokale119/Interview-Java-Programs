package StringPrograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateWordsInString {

	public static void main(String[] args) {

		String inputString = "Java is java again java";
		String[] words = inputString.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String word : words) {
			if (map.containsKey(word.toLowerCase())) {

				map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			} else {
				map.put(word.toLowerCase(), 1);
			}
		}
		System.out.println(map); //Output --{java=3, again=1, is=1}
		Set<String> wordsInString = map.keySet();//map.keySet method to get all keys

		for (String word : wordsInString) {
			if (map.get(word) > 1) {	//To -check word present more than one times 
				System.out.println(word + " : " + map.get(word));  //  Output---java : 3
			}
		}
	}

}