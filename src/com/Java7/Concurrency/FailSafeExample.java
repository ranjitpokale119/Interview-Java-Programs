package Concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
*
* Sr. No.	Key	Fail-Fast	Fail-Safe
1
Exception
Any changes in the collection, such as adding, removing and updating collection during a thread are iterating collection then Fail fast throw concurrent modification exception.
The fail-safe collection doesn't throw exception.
2.
Type of collection
ArrayList and hashmap collection are the examples of fail-fast iterator
CopyOnWrite and concurrent modification are the examples of a fail-safe iterator
3.
Performance and Memory
It's work on actual collection instead. So, this iterator doesn't require extra memory and time
It's working on a clone of the collection instead of actual collection. It is overhead in terms of time and memory
4.
Modifications
 Iterators don't allow modifications of a collection while iterating over it.
Fail-Safe iterators allow modifications of a collection while iterating over it.
*
* */
public class FailSafeExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        //Adding elements to map
        map.put("Dell", 1);
        map.put("IBM", 2);
        //Getting an Iterator from map
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + " : " + map.get(key));
            map.put("Google", 3);
        }

        System.out.println("Whole map : " + map);
    }
}
