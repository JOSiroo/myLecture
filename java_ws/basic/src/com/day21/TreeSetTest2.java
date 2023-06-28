package com.day21;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person[ name = " + name + ", age = " + age + "]";
	}
	
	public int compareTo(Person p) {
		//나이를 기준으로 정렬하도록 오버라이딩
		if(this.age > p.age) {
			return 1;
		}else if(this.age < p.age) {
			return -1;
		}else {
			return 0;
		}
		
		//return this.age-p.age;
	}
}
public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<>();
		
		tset.add(new Person("홍길동", 20));
		//java.lang.ClassCastException : Person cannot be cast to class java.lang.Comparable
		tset.add(new Person("김길동", 17));
		tset.add(new Person("이길동", 31));
		//Person 인스턴스가 저장될 때마다 기존에 저장된 인스턴스와의 비교를 위해서
		//compareTo() 메서드를 빈번히 호출하여, 이때 반환되는 값을 기반으로 정렬을 진행

		Iterator<Person> iter = tset.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}
	}

}
