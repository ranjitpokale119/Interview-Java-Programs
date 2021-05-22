package Concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //Getting an Iterator from list
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer integer = (Integer) it.next();
            list.add(4);
        }
    }
}
