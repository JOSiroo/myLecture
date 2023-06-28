package com.day12;
class Man{
	//멤버변수는 private으로 선언
	//대신 멤버변수의 값을 가져오거나 변경하기 위해서 getter/setter를 만든다
	private int age;
	int height;
	
	//getter/setter
	/*
	public void setAge(int p_age) {	//쓰기, 값을 넣는 용도
		age = p_age;
	}
	*/
	public void setAge(int p_age) {	//쓰기, 값을 넣는 용도
		if(p_age < 0) {
			p_age = 1;
		}else {
			age = p_age;
		}
		age = p_age;
	}
	
	public int getAge() {	//읽기 값을 불러오는 용도
		
		return age;
	}
}

public class ManTest {

	
	public static void main(String[] args) {
		Man m = new Man();
		m.height = 180;
		m.setAge(20);
		
		System.out.println("키 : " + m.height);
		System.out.println("나이 : " + m.getAge());
		
		m.setAge(-5);
		System.out.println("나이 : " + m.getAge());
	
		m.height = -200;
		System.out.println("키 : " + m.height);
	}

}
