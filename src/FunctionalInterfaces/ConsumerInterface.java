package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class ConsImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}*/

public class ConsumerInterface {

	Consumer<Integer> ci = new Consumer<Integer>() {

		@Override
		public void accept(Integer intq) {
		}

	};

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7);
		// Consumer<Integer> c = new ConsImpl();

		/*
		 * Consumer<Integer> c = new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.println(t); }
		 * 
		 * };
		 */

		//Consumer<Integer> c = t-> System.out.println(t);

		/*
		 * for (Integer integer : list) { c.accept(integer);
		 * 
		 * }
		 */
		list.forEach(t -> System.out.println(t));
	//	list.forEach(c);
	}

}
