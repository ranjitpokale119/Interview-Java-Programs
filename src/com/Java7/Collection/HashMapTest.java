package com.Java7.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();

		hMap.put("sasa", 1);
		hMap.put("sasas", 2);
		hMap.put("sasa", 3);
		hMap.put("sasa", 4);

		for (Map.Entry m : hMap.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());

		}
	}
}