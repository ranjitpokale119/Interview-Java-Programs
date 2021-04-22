package StringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Count "is" in Following String

public class CountWordWithoutSpaceOccurence {
	public static void main(String[] args) {
		String in = "This is java is a java";

		int i = 0;
		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher(in);
		while (m.find()) {
			i++;
		}
		System.out.println(" Occurences of " + p + " are : " + i);
	}
}