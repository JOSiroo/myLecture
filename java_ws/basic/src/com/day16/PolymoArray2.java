package com.day16;

import java.util.Scanner;

public class PolymoArray2 {
	static Scanner sc = new Scanner(System.in);
	static final int MAX_COUNT = 2;
	static Shape1[] shArr = new Shape1[MAX_COUNT];
	static int index = 0;
	
	public static void showMenu() {
		System.out.print("1.원 2.사각형 3.면적출력 4.종료 ==>");
	}
	
	public static void inputCircle() {
		if(index == MAX_COUNT) {
			System.out.println("데이터가 꽉 찼습니다");
			return;
		}
		
		System.out.print("r = ");
		int r = sc.nextInt();
		shArr[index++] = new Circle1(r);	
	}
	
	public static void inputRect() {
		if(index == MAX_COUNT) {
			System.out.println("데이터가 꽉 찼습니다");
			return;
		}
		
		System.out.print("w = ");
		int w = sc.nextInt();
		System.out.print("h = ");
		int h = sc.nextInt();
		shArr[index++] = new Rect1(w, h);
	}
	
	public static void printArea() {
		if(index == 0) {
			System.out.println("데이터가 존재하지 않습니다");
			return;
		}
		System.out.println("----------- 보기 ------------");
		for(int i = 0; i < index; i++) {
			System.out.println(shArr[i].kind() + (int)shArr[i].findArea());
		}
		System.out.println("---------------------------");
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			showMenu();
			int type = sc.nextInt();
		
			switch(type) {
			case 1 :
				inputCircle();
				break;
			case 2:
				inputRect();
				break;
			case 3:	
				printArea();
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
		
		
		











