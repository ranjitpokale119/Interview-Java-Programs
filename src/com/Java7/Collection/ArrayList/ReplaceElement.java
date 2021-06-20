package com.Java7.Collection.ArrayList;

import java.util.ArrayList;

// Java program to demonstrate set()
// method of ArrayList
public class ReplaceElement {

    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            // adding elements to the list
            String replacingEle = "E";
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            System.out.println("List before replacing element : " + list);
            // 2 is the index of the element "C".
            //"C" will be replaced by "E"
            System.out.println("replacingEle = " + replacingEle);
            list.set(2, replacingEle);
            System.out.println("List after replacing element : " + list);
            //list.set(6, "z"); //this will throw an IndexOutOfBoundsException as there are only 4 elements in list
            list.remove(2);
            list.add(2, "F");
            System.out.println("List after remove-add element : " + list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
