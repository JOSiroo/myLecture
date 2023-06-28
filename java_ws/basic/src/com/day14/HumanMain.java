package com.day14;

import java.util.Scanner;

class Human{
	protected String name;
	protected int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Teacher extends Human{
	private String subject;
	
	Teacher(String subject){
		this.subject = subject;
	}
	
	//선생님 메서드

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void work() {
		
		System.out.println(subject + "를 가르친다");
	}
}

class Programmer extends Human{
	private int career;
	
	Programmer(int career){
		this.career = career;
	}
	public int getCareer() {
		return career;
	}
	
	public void setCareer(int career) {
		this.career = career;
	}
	
	public void program() {
	
		System.out.println("개발경력 : " + career);
		System.out.println("프로그래밍을 합니다");
	}

}


public class HumanMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 과목을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String subject = sc.nextLine();
		Teacher tc = new Teacher(subject);
		
		System.out.println("============================");
		
		tc.setName(name);
		tc.setAge(age);
		
		System.out.println("이름 : " + tc.getName());
		System.out.println("나이 : " + tc.getAge());
		tc.work();
		
		System.out.println("이름, 나이, 개발경력을 입력하세요");
		name = sc.nextLine();
		age = sc.nextInt();
		int career = sc.nextInt();
		
		System.out.println("============================");
		
		Programmer pro = new Programmer(career);
		pro.setName(name);
		pro.setAge(age);
				
		System.out.println("이름 : " + pro.getName());
		System.out.println("나이 : " + pro.getAge());
		pro.program();
	}

}
