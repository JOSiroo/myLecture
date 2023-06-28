package com.day12;

import java.util.Scanner;

class Programmer{
	//멤버변수 만들기
		private String name;
		private String language;
		private int career;
	//생성자
		Programmer(String name, String language, int career){
			this.name = name;
			this.language = language;
			this.career = career;
		}
	//getter/setter
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			 return name;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getLanguage() {
			return language;
		}
		public void setCareer(int career) {
			this.career = career;
		}
		public int getCareer() {
			return career;
		}
		
	//메소드
		public void work() {
			System.out.println("이름 : " + name);
			System.out.println("개발언어 : " + language);
			System.out.println("개발경력 : " + career);
		}
	
}

public class ProgrammerMain {
	
	
	public static void main(String[] args) {
		//이름, 개발언어, 개발경력 입력
		System.out.println("이름, 개발언어, 개발경력을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String language = sc.nextLine();
		int career = sc.nextInt();
		
		Programmer pro = new Programmer(name, language, career);
		pro.work();
		
		System.out.println(" ============g/s=============");
		
		pro.setName("조상혁");
		pro.setLanguage("자바");
		pro.setCareer(13);
		pro.work();
	}

}
