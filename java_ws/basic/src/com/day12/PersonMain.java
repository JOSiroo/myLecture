package com.day12;

import java.util.Scanner;

class Person{
	// 1. 멤버변수
	private String name;
	private int age;
	private String phone;
	
	// 2. 생성자
	Person(String name, int age, String phone){
		this.name = name;	
	  //멤버변수    = 매개변수
		this.age = age;
		this.phone = phone;
	}
	
	// this - 자기 자신을 가리키는 this
	// 자신의 멤버를 가리키는 this
	// this.멤버변수, this.멤버
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phone);
	}
	
}

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전화번호 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String phone = sc.nextLine();
		
		Person p = new Person(name, age, phone);
		p.showInfo();
		
		System.out.println("==========================");
		
		//멤버변수 값 변경
		p.setName("조상혁");
		p.setAge(28);
		p.setPhone("010-5555-5555");
		
		System.out.println("이름 - " + p.getName());
		System.out.println("나이 - " + p.getAge());
		System.out.println("전화번호 - " + p.getPhone());
	}

}
