package StringPrograms;

public class StringComparisonExample {

	public static void main(String args[]) {

		String tv = "Bravia";
		String television = "Bravia";

		// String compare example using equals
		if (tv.equals(television)) {
			System.out.println("Both tv and television contains same letters and equal by equals method of String");
		}

		// String compare example in java using compareTo
		if (tv.compareTo(television) == 0) {
			System.out.println("Both tv and television are equal using compareTo method of String");
		}

		television = "BRAVIA";

		// Java String comparison example using equalsIgnoreCase
		if (tv.equalsIgnoreCase(television)) {
			System.out.println("tv and television are equal by equalsIgnoreCase method of String");
		}

		// String comparison example in java using CompareToIgnoreCase
		if (tv.compareToIgnoreCase(television) == 0) {
			System.out.println("tv and television are same by compareToIgnoreCase of String");
		}

		String sony = "Sony";
		String samsung = "Samsung";

		// lexicographical comparison of String in Java with ComapreTo
		if (sony.compareTo(samsung) > 0) {
			System.out.println("Sony comes after Samsung in lexicographical order");
		} else if (sony.compareTo(samsung) < 0) {
			System.out.println("Sony comes before Samsung in lexicographical order");
		}
	}

}
