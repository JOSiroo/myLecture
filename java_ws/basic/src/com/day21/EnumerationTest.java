package com.day21;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Member{
	private String id;
	private String name;

	Member(String id, String name){
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//toString() 오버라이딩
	public String toString() {
		return "Member[id = " + id + ", name = " + name + "]";
	}

	public void showInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name + "\n");
	}
}
public class EnumerationTest {
	public static void main(String[] args) {
		/*
		 	Enumeration 인터페이스
		 		- Iterator의 구버전
		 */

		ArrayList<Member> list = new ArrayList<>(4);
		list.add(new Member("hong", "1"));
		list.add(new Member("kim", "2"));
		list.add(new Member("lee", "3"));

		//Iterator이용
		Iterator<Member> iter = list.iterator();
		while(iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m);
		}
		
		System.out.println("\n============Vector이용=============");
		Vector<Member> vec = new Vector<>(4);
		vec.add(new Member("park", "1"));
		vec.add(new Member("jung", "2"));
		vec.add(new Member("kang", "3"));
		
		Enumeration<Member> en = vec.elements();
		while(en.hasMoreElements()) {
			Member m = en.nextElement();
			System.out.println(m);
		}
	}


}
