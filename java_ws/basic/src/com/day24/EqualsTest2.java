package com.day24;

class Person2{
	private long id;

	Person2(long id){
		this.id = id;
	}

	//Object의 equals() 오버라이딩
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person2) {
			Person2 p = (Person2)obj;
			return this.id == p.id;
		}else {
			return false;
		}

	}

}

public class EqualsTest2 {

	public static void main(String[] args) {
		Person2  p1 = new Person2(9901021112222L);
		Person2  p2 = new Person2(9901021112222L);

		if(p1.equals(p2)) {	//id비교
			System.out.println("p1과 p2는 같은 사람이다" );
		}else {
			System.out.println("p1과 p2는 다른 사람이다.");
		}

		if(p1 == p2) {	//주소값 비교
			System.out.println("p1과 p2는 같은 주소이다" );
		}else {
			System.out.println("p1과 p2는 다른 주소이다.");
		}
	}

}
