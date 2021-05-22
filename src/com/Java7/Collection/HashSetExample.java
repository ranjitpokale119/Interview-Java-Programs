package com.Java7.Collection;

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

    @Override
    public int hashCode() {
        return this.id * 117;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /*Equals and Hashcode Contract*/
    /*1. If two objects are equal then they should also have same hashcode*/
    /*2. If two object's hashcode are same then objects may or may not be equal*/

}

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Book> set = new HashSet<Book>();

        Book b1 = new Book(1, "ABC", "NAGAR", 98457893);
        Book b2 = new Book(1, "ABC", "NAGAR", 98457893);
        Book b3 = new Book(1, "ABC", "NAGAR", 98457893);
        Book b4 = b1; //Cloning

        set.add(b1);
        set.add(b2);
        set.add(b3);

        set.add(b4);//Adding cloned obj..This obj will not be added because it will b4 and b1 will have same hashcode
        for (Book book : set) {
            out.println(book.id + "       " + book.name + "       " + book.address + "         " + book.mobile);
        }

    }

}