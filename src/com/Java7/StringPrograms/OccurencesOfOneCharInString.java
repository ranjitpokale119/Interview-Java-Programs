package StringPrograms;

import java.util.Scanner;

//Write a routine that takes as input a string such as "aabbccdef" and o/p "a2b2c2def" or "a4bd2g4" for "aaaabddgggg".

public class OccurencesOfOneCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next().toLowerCase();
		System.out.println("Enter a character " + s);
		char c = sc.next(".").toLowerCase().charAt(0); // This logic is to read
														// only one character
		int cn = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				cn++;
			}
		}
		System.out.println(c + " occurs " + cn + " times in " + s);
		sc.close();
	}
}