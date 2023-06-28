package com.day12;

import java.util.Scanner;

public class Triangle3_Class {
	//멤버변수가 있는 클래스
	// 1. 멤버변수
	int width;	//10
	int height;	//20
	
	// 2. 생성자
	Triangle3_Class(int w, int h){
		width = w;
		height = h;
	}
	// 3. 메서드
	public double findArea() {
		int area = width*height/2;
		return area;
	}
	
	public static void main(String[] args) {
		//삼각형 면적 구하기
		//[4] 클래스를 새로 만들어서(멤버변수 있는 클래스) 면적 구하는 메서드를 만들고,
		//이를 이용하여 면적 구한다
		
		//사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//로직 처리 - 삼각형 면적 구하기
		//1) 객체 생성
		Triangle3_Class tr = new Triangle3_Class(w, h);
		
		//2)메서드 호출 - 참조변수,메서드()
		double area = tr.findArea();
		
		//결과 출력
		System.out.println("삼각형의 면적 : " + area);
	
	}

}
