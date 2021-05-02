package StringPrograms;

import java.util.HashMap;
import java.util.Map;

//Count occurrences of each word in given string
public class CountWordOccurence {
    public static void main(String[] args) {

        String input = "This is java is a java";
        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] word = input.split(" ");
        for (String s : word) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println("Count :- " + map); // Output---Count :- {a=1, java=2, This=1, is=2}

    }
}
