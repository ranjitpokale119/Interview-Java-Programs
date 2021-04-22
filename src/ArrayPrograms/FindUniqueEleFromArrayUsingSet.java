package ArrayPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindUniqueEleFromArrayUsingSet {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 3, 7, 7, 8, 9, 9, 9, 10 };
		int end = arr.length;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < end; i++) {
			set.add(arr[i]);
		}

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
