package com.day16;

import java.util.Scanner;

class Shape1{
	public double findArea() {
		return 0;
	}
	public String kind() {
		return "도형의 종류";
	}
}

class Circle1 extends Shape1{
	private int r;
	
	Circle1(int r) {
		this.r = r;
	}
	public double findArea() {
		return Math.PI*r*r;
	}
	
	public String kind() {
		return "원의 면적 : ";
	}
}

class Rect1 extends Shape1{
	private int w, h;
	
	Rect1(int w, int h){
		this.w = w;
		this.h = h;
	}
	public double findArea() {
		return w*h;
	}
	public String kind() {
		return "사각형의 면적 : ";
	}
}
public class PolymoArray1 {
	public static void main(String[] args) {
		final int MAX_COUNT = 2;
		Shape1[] shArr = new Shape1[MAX_COUNT];
		//String[] result = new String[MAX_COUNT];
		int index = 0;
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1.원 2.사각형 3.면적출력 4.종료 ==>");
			int type = sc.nextInt();
			
			
			if(type == 1 || type == 2) {
				if(index == MAX_COUNT) {
					System.out.println("데이터가 꽉 찼습니다");
					continue;
				}
			}
			
			switch(type) {
				case 1 :
					System.out.print("r = ");
					int r = sc.nextInt();
					shArr[index++] = new Circle1(r);	
					break;
				case 2:
					System.out.print("w = ");
					int w = sc.nextInt();
					System.out.print("h = ");
					int h = sc.nextInt();
					
					shArr[index++] = new Rect1(w, h);
					//result[index] = index + "번째배열 사각형의 면적 : " + ((int)shArr[index].findArea()*100)/100.0;
					break;
				case 3:	
					System.out.println("----------- 보기 ------------");
					for(int i = 0; i < index; i++) {
						System.out.println(shArr[i].kind() + (int)shArr[i].findArea());
					}
					System.out.println("---------------------------");
					break;
				case 4:
					System.out.println("종료함!");
					return;
				default:
					System.out.println("잘못입력!\n");
					continue;
			}//switch
		}//while
	}

}











