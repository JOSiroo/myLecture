package com.day17;
class Person{
	public String kind() {
		return "사람";
	}
};
class Student extends Person{
	public String kind() {
		return "학생";
	}
};
class Graduate extends Student{
	public String kind() {
		return "대학원생";
	}
};
class Assistant extends Person {
	public String kind() { 
		return "조교";
	}
};
class Professor extends Person {
	public String kind() {
		return "교수";
	}
}//
public class PolymoArgs {
	/*
	public static void register(Student s) {
		System.out.println( s.kind() + "이/가 등록합니다.");
	}
	public static void register(Graduate g) {
		System.out.println( g.kind() + "이/가 등록합니다.");
	}
	public static void register(Assistant a) {
		System.out.println( a.kind() + "이/가 등록합니다.");
	}
	 */
	
	public static void  register(Person p) {
		if(p instanceof Student || p instanceof Assistant) {
			System.out.println(p.kind() + "이/가 등록합니다.");
		}else {
			System.out.println(p.kind() + "은/는 등록할 수 없습니다.");
		}
	}
	public static void main(String[] args) {
		/*
		register(new Student());
		register(new Graduate());
		register(new Assistant());
		*/
		
		register(new Student());
	} 

}
