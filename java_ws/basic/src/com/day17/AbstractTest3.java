package com.day17;

import java.util.Scanner;

abstract class Shape1{
	abstract public double findArea();
	abstract public String kind();
	
}

class Circle1 extends Shape1{
	private int r;
	
	Circle1(int r){
		this.r = r;
	}
	public double findArea() {
		return 3.14*r*r;
	}
	public void radius() {
		System.out.println("반지름 : " + r);
	}
	public String kind() {
		return "원";
	}
}

class Rectangle1 extends Shape1{
	private int w;
	private int h;
	
	Rectangle1(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double findArea() {
		return w*h;
	}
	public void wh() {
		System.out.println("가로, 세로 : " + w + ", " + h);
	}
	public String kind() {
		return "사각형";
	}
}
public class AbstractTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape1[] sh = new Shape1[3];
		
		for(int i = 0; i < sh.length; i++) {
			System.out.println("도형을 선택하세요");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("반지름 입력!");
				int radius = sc.nextInt();
				sh[i] = new Circle1(radius);
				if(sh[i] instanceof Circle1) {
					Circle1 c = (Circle1)sh[i];
					System.out.println("면적 : " + c.findArea()); 
					c.radius();
				}
			}else if(menu == 2) {
				System.out.println("가로, 세로 입력!");
				int w = sc.nextInt();
				int h = sc.nextInt();
				sh[i] = new Rectangle1(w, h);
				if(sh[i] instanceof Rectangle1) {
					Rectangle1 r = (Rectangle1)sh[i];
					System.out.println("면적 : " + r.findArea()); 
					r.wh();
				}
			}

		}
		System.out.println("==============확장 for============");
		for(Shape1 shape : sh) {
			System.out.println(shape.findArea());
		}
	}

}
