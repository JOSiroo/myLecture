package com.day12;

import java.util.Scanner;

public class Rectangle1_Class {
	
	//멤버변수가 있는 클래스
		// 1. 멤버변수
		int width;
		int height;
		// 2. 생성자
		Rectangle1_Class(int w, int h){
			width = w;
			height = h;
		}
		// 3. 메서드
		public double findArea() {
			return width*height;
		}
		public double girth() {
			return (width+height)*2;
		}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle1_Class rec = new Rectangle1_Class(10, 5);
		double area = rec.findArea();
		double girth = rec.girth();
		
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + girth);
		
		System.out.println("가로, 세로 재입력");
		rec.width = sc.nextInt();
		rec.height = sc.nextInt();
		
		area = rec.findArea();
		girth = rec.girth();
		
		System.out.println("바뀐 사각형의 넓이 : " + area);
		System.out.println("바뀐 사각형의 둘레 : " + girth);
		
	}

}
