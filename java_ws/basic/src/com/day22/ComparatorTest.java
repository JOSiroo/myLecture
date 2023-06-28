package com.day22;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//문자열을 코드순이 아니라 길이 순으로 정렬하도록 지정 
class StringLenComparator implements Comparator<String>{
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
		/*
		 	o1이 크면 양수, o2가 크면 음수, 같으면 0을 리턴
		*/
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {
		//public TreeSet(Comparator<? super E> comparator)
		
	TreeSet<String> set = new TreeSet<>(new StringLenComparator());	//StringLenComparator클래스 내의 compare메서드에 의해 문자열의 길이에 따라 정렬
	//TreeSet<String> set = new TreeSet<>();	//코드값에 의한 정렬
	set.add("Orange");
	set.add("Apple");
	set.add("Dog");
	set.add("Individual");
	
	Iterator<String> iter = set.iterator();
	while(iter.hasNext()) {
		String str = iter.next();
		System.out.println(str);
	}
	}

}
