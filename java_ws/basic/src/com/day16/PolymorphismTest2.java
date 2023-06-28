package com.day16;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("도형을 그리는 메서드");
	}
	public void delete() {
		System.out.println("도형을 지우는 메서드");
	}
	public void display() {
		System.out.println("부모 Shape의 display() 메서드");
	}
	
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그린다");
	}
	public void delete() {
		System.out.println("원을 지운다");
	}
	public void sayCircle() {
		System.out.println("나는 원이야");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
	public void delete() {
		System.out.println("삼각형을 지운다");
	}
	public void sayTriangle() {
		System.out.println("나는 삼각형이야");
	}
	
}
public class PolymorphismTest2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();
		
		System.out.println("=========다형성 이용=========\n");
		Shape sh = new Circle();
		sh.draw();
		sh.delete();
		
		sh.display();		//부모 메서드
		//sh.sayCircle();	//error : 자식만의 메서드는 접근 불가

		System.out.println("\n-----------------------------------");
		sh = new Triangle();
		sh.draw();
		sh.delete();
		
		//사용자로부터 입력받아 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 원 2. 삼각형 선택");
		int type = sc.nextInt();
		
		if(type == 1) {
			Circle c2 = new Circle();
				c2.draw();	
				c2.delete();
		}else if(type == 2) {
			Triangle tr = new Triangle();
			tr.draw();
			tr.delete();
		}else {
			System.out.println("잘못입력함");
		}
		System.out.println("\n===========다형성=============");
		
		Shape sh2 = null;
		if(type == 1) {
			sh2 = new Circle();
		}else if(type == 2) {
			sh2 = new Triangle();
		}else {
			System.out.println("잘못 입력");
			return;
		}

		sh2.draw();
		sh2.delete();
		
		
		//메서드 이용
		System.out.println("=========메서드이용=========");
		int a = sc.nextInt();
		Shape sh3 = createShape(a);
		if(sh3 != null) {	//★★★★★★★★
			sh3.draw();		//★★★★★★★★
			sh3.delete();	//★★★★★★★★
		}else {
			System.out.println("잘못입력!!!");
		}
		
		
		System.out.println("=========배열===========");
		//배열
		//Circle 배열 만들고 요소 2개 넣은 후 draw, delete메서드 호출
		Circle[] cir = new Circle[2];
		
		for(int i = 0; i < cir.length; i++) {
			cir[i] = new Circle();
			cir[i].draw();
			cir[i].delete();
		}
		
		//배열 - 다형성 이용
		System.out.println("========다형성 이용한 배열===========");
		Shape[] shArr = new Shape[3];
		shArr[0] = new Circle();
		shArr[1] = new Triangle();
		shArr[2] = new Circle();
		
		for(int i = 0; i < shArr.length; i++) {
			shArr[i].draw();
			shArr[i].delete();
		}//for
		
		System.out.println("\n----------확장 for-----------");
		for(Shape q : shArr) {
			q.draw();
			q.delete();
		}//확장 for
		
	}

	//리턴타입 : Shape - 부모인 Shape가 리턴된다는 것은 자식객체가 리턴된다는 의미
	public static Shape createShape(int type) {
		Shape sh2 = null;
		if(type == 1) {
			sh2 = new Circle();
		}else if(type == 2) {
			sh2 = new Triangle();
		}
		return sh2;
	}
	
}
