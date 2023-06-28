package com.day24;
/*
		 	[1] 연산자 ==
		 		- 기본 자료형에서는 값이 같은지 비교
		 		- 참조형에서는 주소값을 비교
		 		
		 	[2] String클래스의 eqauls()메서드
		 		- 값이 같은지 비교
		 		- Object의 equals()메서드를 오버라이딩 한 것
		 		
		 	[3] Object 클래스의 eqauls()
		 		- 주소값을 비교
 */

class Man{
	private int age;
	
	Man(int age){
		this.age = age;
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		Man m = new Man(20);
		Man m2 = new Man(25);
	
		if(m == m2) {	//참조형에서는 주소값 비교
			System.out.println("m과 m2는 같다");
		}else {
			System.out.println("m과 m2는 다르다");
		}
		
		if(m.equals(m2)) {	//주소값 비교
			System.out.println("m과 m2는 같다");
		}else {
			System.out.println("m과 m2는 다르다");
		}
		
		m2 = m;
		if(m.equals(m2)) {	//주소값 비교
			System.out.println("m과 m2는 같다");
		}else {
			System.out.println("m과 m2는 다르다");
		}
	}

}
