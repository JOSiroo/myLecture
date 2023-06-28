package com.day18;

import java.util.Scanner;

//인터페이스 내에 존재하는 변수는 무조건 public static final 로 선언된다는 특성을 활용.
//자바에서 사용하는 다수의 상수 선언 방식
interface Week{
		int MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6, SUN = 7;
}
public class InterfaceConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("요일 선택!");
		System.out.println("1.월 2.화 3.수 4.목 5.금 6.토 7.일");
		int sel = sc.nextInt();
		
		switch(sel) {
		case Week.MON :
			System.out.println("주간회의가 있어요");
			break;
		case Week.TUE :
			System.out.println("프로젝트 기회회의가 있어요");
			break;
		case Week.WED :
			System.out.println("진행사항 보고하는 날 입니다");
			break;
		case Week.THU :
			System.out.println("사내 축구시합이 있는 날 입니다");
			break;
		case Week.FRI :
			System.out.println("프로젝트 마감일입니다");
			break;
		case Week.SAT :
			System.out.println("가족과 함께!");
			break;
		case Week.SUN :
			System.out.println("오늘은 휴일!");
			break;
		default :
			System.out.println("잘못입력!");
		}//switch
	}

}
