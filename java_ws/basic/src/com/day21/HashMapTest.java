package com.day21;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("boy", "소년");
		map1.put("girl", "소녀");
		map1.put("school", "학교");
		
		Iterator<String> iter = map1.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map1.get(key);
			System.out.println(key + " => " + value);
		}
	}

}
