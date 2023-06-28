package com.day18;

import java.util.Scanner;

interface IShape{
	void draw();
	void delete();
}
class Circle implements IShape{
	
	public void draw() {
		System.out.println("원을 그립니다");
	}
	public void delete() {
		System.out.println("원을 지웁니다");
	}
}
class Rect implements IShape{
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
	public void delete() {
		System.out.println("사각형을 지웁니다");
	}
}
public class InterfaceTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IShape[] is = new IShape[3];
		for(int i = 0; i < is.length; i++) {
			System.out.println("도형을 선택하세요 <1. 원, 2. 사각형>");
			int type = sc.nextInt();
			
			if(type == 1) {
				is[i] = new Circle();
			}else if(type == 2) {
				is[i] = new Rect();
			}else {
				System.out.println("잘못 입력하셨습니다");
				return;
			}
			is[i].draw();
			is[i].delete();
			System.out.println(" ");
		}
		for(IShape a : is) {
			a.draw();
			a.delete();
		}
		
		
		
	}

}
