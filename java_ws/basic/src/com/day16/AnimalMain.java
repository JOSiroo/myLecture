package com.day16;

import java.util.Scanner;

class Animal{
	public void bark(){
		System.out.println("울다");
	}
	public void parent(){
		System.out.println("난 부모-동물");
	}
}
class Cat extends Animal{
	public void bark()
	{
		System.out.println("야옹야옹");
	}
	public void child()
	{
		System.out.println("난 자식-고양이");
	}
}
class Cow extends Animal{
	public void bark()
	{
		System.out.println("음메음메");
	}
}
class Dog extends Animal{
	public void bark()
	{
		System.out.println("멍멍");
	}
}

public class AnimalMain {
	
	public static Animal animalType(int type) {
		Animal an = null; 
		switch(type) {
		case 1 :
			an = new Cat();
			break;
		case 2 :
			an = new Dog();
			break;
		case 3 :
			an = new Cow();
			break;
		}
		return an;
	}
	
	public static void main(String[] args) {
		// 1. 다형성 기본
		Animal ani = new Cat();
		Cat cat = new Cat();
		ani.bark();
		//ani.parent();
		//cat.child();
		
		System.out.println("==============Cat================");
		Animal ani1 = new Dog();
		ani1.bark();
		System.out.println("================Dog==============");
		Animal ani2 = new Cow();
		ani2.bark();
		System.out.println("================Cow==============");
		// 2. 사용자 입력받기, 다형성 이용
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("동물 선택 1. 고양이, 2. 강아지, 3. 소");
				
		ani = null;
		int type = sc.nextInt();
		if(type == 1) {
			ani = new Cat();
		}else if(type == 2) {
			ani = new Dog();
		}else if(type == 3) {
			ani = new Cow();
		}
		ani.bark();		
	
		
		
		
		
		//메서드 이용
		System.out.println("메서드 이용\n동물을 선택하세요 1. 고양이, 2. 강아지, 3. 소");
		int animalType = sc.nextInt();
		Animal aniType = animalType(animalType);
		if(aniType != null) {
			aniType.bark();
		}else {
			System.out.println("잘못입력");
		}
		
		System.out.println("======다형성배열======");
		//다형성 이용한 배열 이용
		Animal[] an = new Animal[3];
		an[0] = new Cat();
		an[1] = new Dog();
		an[2] = new Cow();
		
		for(Animal q : an) {
			q.bark();
		}
		
	
	}

}
