package ArrayPrograms;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] a = new int[] { 45, 12, 78, 34, 89, 21 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		// Output : [12, 21, 34, 45, 78, 89]
	}
}