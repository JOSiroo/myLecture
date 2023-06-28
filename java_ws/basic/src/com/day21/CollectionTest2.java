package com.day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest2 {

	public static void main(String[] args) {
		ArrayList<Character> clist = new ArrayList<>(26);
		for(int i = 0; i < 26; i++) {
			clist.add((char)('A'+i));
		}
		System.out.println("--------------------ArrayList 이용--------------------\nfor");
		for(int i = 0; i < clist.size(); i++) {
			System.out.print(clist.get(i) + " ");
		}
		System.out.println("\n확장for");
		for(char c : clist) {
			System.out.print(c + " ");
		}
		////////////////////////////////////////////////////////////////
		HashMap<Integer, Character> map = new HashMap<>(26);
		for(int i = 0; i < 26; i++) {
			map.put(i, (char)('A'+i));
		}
		System.out.println("\n--------------------HashMap 이용--------------------");
		System.out.println("Iterator");
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			char value = map.get(key);
			System.out.print(value + " ");
		}
		System.out.println("\nfor");
		for(int i = 0; i < map.size(); i++) {
			System.out.print(map.get(i) + " ");
		}
		
		System.out.println("\n--------------------HashSet 이용--------------------");
		HashSet<Character> set = new HashSet<>(26);
		for(int i = 0; i < 26; i++) {
			set.add((char)('A'+i));
		}
		System.out.println("Iterator");
		Iterator<Character> cIter = set.iterator();
		while(cIter.hasNext()) {
			System.out.print(cIter.next() + " ");
		}
	}

}
