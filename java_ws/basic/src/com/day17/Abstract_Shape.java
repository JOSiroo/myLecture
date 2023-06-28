package com.day17;

import java.util.Scanner;

abstract class Shape{
	abstract public void draw();
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
	
}
public class Abstract_Shape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요 1. 원, 2. 사각형");
		int type = sc.nextInt();
		Shape sh = null;
		if(type == 1) {
			sh = new Circle();
		}else if(type == 2) {
			sh = new Rect();
		}else {
			System.out.println("잘못입력!");
			return;
		}
		sh.draw();
	}

}
