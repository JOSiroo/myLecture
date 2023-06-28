package com.day15;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	Person(String name, int age){ //★★★★★
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.print("이름 : " + name);
		System.out.println(", 나이 : " + age);
	}
}//

class Student extends Person{
	protected String stNo;
	
	Student(String name, int age, String stNo){
		super(name, age);//★★★★★★
		this.stNo = stNo;
	}
	
	public void showInfo() {
		super.showInfo(); // ★★★ 부모 메서드 호출
		System.out.println("학번 : " + stNo);
	}
	public void study() {
		System.out.println("공부합니다");
	}
}//

class Graduate extends Student{
	private String major;
	
	Graduate(String name, int age, String stNo, String major){
		super(name, age, stNo);
		this.major = major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
	public void writeThesis() {
		System.out.println("논문 쓴다 불만있냐");
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("이름 , 나이, 전공 입력");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
				
		Student st = new Student(name, age, major);
		st.showInfo();
		*/
		System.out.println("이름, 나이, 학번, 전공 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String stNo = sc.nextLine();
		String major = sc.nextLine();
		
		Graduate gra = new Graduate(name, age, stNo, major);
		gra.showInfo();
		gra.study();
		gra.writeThesis();
	}

}







