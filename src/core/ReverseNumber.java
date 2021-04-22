package core;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 2331, reversed = 0;

		while (num != 0) {
			int rem = num % 10;
			reversed = reversed * 10 + rem;
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);
	}
}