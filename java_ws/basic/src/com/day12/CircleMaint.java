package com.day12;

import java.util.Scanner;

//원을 나타내는 클래스
class Circle{
	// 1. 멤버변수
	int radius; //반지름
	
	// 2. 생성자
	Circle(int r){
		radius = r;
	}
	Circle(){
		
	}
	
	// 3. 메서드
	// 원의 넓이를 구하는 메서드
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	
	//원의 둘레를 구하는 메서드
	public double findGirth() {
		double girth = 2*radius*3.14;
		return girth;
	}
}

public class CircleMaint {

	public static void main(String[] args) {
		// 1. 객체 생성
		Circle cc = new Circle(30);
		
		
		// 2. 메서드 호출
		//먼저 멤버변수인 반지름 값을 넣어준다
		//멤버변수에 값을 직접 할당
		cc.radius = 10;
		
		//그리고 나서 메서드 호출
		double area = cc.findArea();
		System.out.println("원의 면적 : " + area);
		System.out.println("반지름 : " + cc.radius);
		
		double girth = cc.findGirth();
		System.out.println("원의 둘레 : " + girth);
		System.out.println("반지름 : " + cc.radius);
		
		//멤버변수의 값 변경
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력!");
		int r = sc.nextInt();
		
		cc.radius = r; // 멤버변수에 값 직접 할당
		area = cc.findArea();
		System.out.println("반지름 변경 후 원의 면적 : " + area);
	

	
	}	
	
}
