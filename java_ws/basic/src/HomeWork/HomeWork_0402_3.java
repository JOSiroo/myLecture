package HomeWork;

import java.util.Scanner;

class Shape{
	
	public int findArea() {
		return 0;
	}
}

class Circle extends Shape{
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double findArea(int radius) {
		return 3.14*radius*radius;
	}
}

class Rectangle1 extends Shape{
	private int w;
	private int h;
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	public int findArea(int w, int h) {
		return h*w;
	}
}
public class HomeWork_0402_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름 입력");
		int radius = sc.nextInt();
		
		Circle cir = new Circle();
		System.out.println("원의 반지름 : " + cir.findArea(radius));
		
		System.out.println("가로, 세로 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		Rectangle1 rec = new Rectangle1();
		System.out.println("사각형의 면적 : " + rec.findArea(w, h));
		
	}

}
