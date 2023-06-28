package com.day20.collection;

class Person{
	private String name;
	private int age;
	
	//Object클래스의 toString()메서드 오버라이딩
	public String toString() {
		return "Person[name = " + name + ", age = " + age + "]";
	}
}

public class ObjectTest2 {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		System.out.println("\n" + p.toString());
	}

}
