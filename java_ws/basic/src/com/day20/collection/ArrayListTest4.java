package com.day20.collection;

import java.util.ArrayList;

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

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>(5);
		
		list.add(new Member("Hong", "홍길동"));
		list.add(new Member("Kim", "김길동"));
		
		Member m = new Member("lee", "이길동");
		list.add(m);
		
		//읽어오기
		for(int i = 0; i < list.size(); i++) {
			Member m1 = list.get(i);
			m1.showInfo();
		}
		
		System.out.println("\n===================");
		for(Member m1  : list) {
			System.out.println(m1);
		}
		
		
	}

}
