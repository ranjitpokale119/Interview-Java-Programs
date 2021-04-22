package Collection;

import java.util.*;
import static java.lang.System.out;

class Book {
	int id;
	String name, address;
	int mobile;

	public Book(int id, String name, String address, int mobile) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

}

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Book> set = new HashSet<Book>();

		Book b1 = new Book(1, "ABC", "NAGAR", 98457893);
		Book b2 = new Book(1, "ABC", "NAGAR", 98457893);
		Book b3 = new Book(1, "ABC", "NAGAR", 98457893);

		set.add(b1);
		set.add(b2);
		set.add(b3);
		for (Book book : set) {
			out.println(book.id + "       " + book.name + "       " + book.address + "         " + book.mobile);
		}

	}

}