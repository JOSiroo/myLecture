package com.day19.ETC;

import java.util.Scanner;

abstract class Shape {
	private Point p;
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	Point getP() {
		return p;
	}
	void setP(Point p) {
		this.p = p;
	}
	abstract double findArea(); // 도형의 면적을 계산해서 반환하는 메서드
}
class Point{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	Point(){
		this(0, 0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String findInfo() {
		return "["+x+","+y+"]";
	}
}


class Circle extends Shape{
	private Point p;
	private double r;

	Circle(double r){
		this(new Point(0, 0));
		this.r = r;
	}

	Circle(Point p){
		this.p = p;
	}

	public double findArea() {
		return r*3.14*3.14;
	}
}
class Rect extends Shape{
	private Point p;
	private int width;
	private int height;

	Rect(int width, int height){
		this(new Point(0, 0));
		this.width = width;
		this.height = height;
	}
	Rect(Point p){
		this.p = p;
	}

	public double findArea() {
		return width*height;
	}
	public boolean isSquare() {
		boolean bool = false;
		if(width == height && width*height != 0) {
			bool = true;
		}else {
		}
		return bool;
	}
}
public class ShapeMain {
	public static double sumArea(Shape[] arr) {
		double result = 0.0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Circle) {
				Circle c = (Circle)arr[i];
				result += c.findArea();
			}else if(arr[i] instanceof Rect) {
				Rect r = (Rect)arr[i];
				r.findArea();
				result += r.findArea();
			}
		}
		return result;
	}
	public static Shape[] result(int qty) {
		Scanner sc = new Scanner(System.in);
		Shape[] arr = new Shape[qty];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("도형 선택 1. 원 2. 사각형");
			int type = sc.nextInt();
			if(type == 1) {
				System.out.println("반지름을 입력하세요");
				int r = sc.nextInt();
				arr[i] = new Circle(r);
			}else if(type == 2) {
				System.out.println("가로 세로 입력하세요");
				int w = sc.nextInt();
				int h = sc.nextInt();
				arr[i] = new Rect(w, h);
				if(arr[i] instanceof Rect){
					Rect r = (Rect)arr[i];
					String str = "";
					if(r.isSquare()) {
						str = "정사각형입니다";
					}else {
						str = "정사각형이 아닙니다";
					}
					System.out.println(str);
				}
			}
		}
	return arr;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape[] arr = result(2);
		System.out.println(sumArea(arr));
	
	}
}




















/*
		Shape[] arr = new Shape[2];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("도형을 선택하세요 1. 원,  2. 사각형");
			int type = sc.nextInt();
			if(type == 1) {
				System.out.println("반지름을 입력하세요");
				int r = sc.nextInt();
				arr[i] = new Circle(r);
			}else if(type == 2) {
				System.out.println("가로 세로 입력하세요");
				int w = sc.nextInt();
				int h = sc.nextInt();
				arr[i] = new Rect(w, h);
				if(arr[i] instanceof Rect){
					Rect r = (Rect)arr[i];
					String str = "";
					if(r.isSquare()) {
						str = "정사각형입니다";
					}else {
						str = "정사각형이 아닙니다";
					}
					System.out.println(str);
				}
			}
			arr[i].findArea();
		}
		System.out.println(sumArea(arr));
 */