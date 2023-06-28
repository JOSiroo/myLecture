package com.day21;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest1 {
	public static void main(String[] args) {
		/*
		 	HashSet - Set 인터페이스의 구현 클래스
		 		- 순서 유지되지 않고, 중복 저장 허용되지 않는다
		*/
		HashSet<String> set = new HashSet<>(4);
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");
		System.out.println("저장된 데이터 개수 : " + set.size());
		
		//읽어오기 ★★★★★★★
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}//while
		
		/*
	 	Iterator - 컬렉션에 저장된 각 요소에 접근하는 기능을 가진 인터페이스
	*/
	}

}
