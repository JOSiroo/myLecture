package com.day8;

import java.util.Scanner;

public class MethodTest6_test {

	public static String leapYear(int year) {
		String result = "";
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				result = "윤년";
			}else {
				result = "평년";
			}
		return result;
	}
	
	public static String oddEven(int num) {
		String result = "";
			if(num % 2 == 0) {
				result = "짝수";
			}else if(num % 2 ==1) {
				result = "홀수";
			}else {
				result = "잘못 입력하셨습니다";
			}
		return result;
	}
	
	public static String idGender(char idnum) {
		String result = "";
			if(idnum == '1' || idnum == '3') {
				result = "남자";
			}else if(idnum == '2' || idnum == '4') {
				result = "여자";
			}else {
				result = "잘못 입력하셨습니다";
			}
		return result;	
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년 계산기\n년도 입력 :");
		int year = sc.nextInt();
		String result = leapYear(year);
		System.out.println(year + "년 : " + result);

		
		System.out.print("\n홀수 짝수 구분\n숫자 입력 : ");
		int num = sc.nextInt();
		String result1 = oddEven(num);
		System.out.println( num + "은 " + result1);
		
		sc.nextLine();
		
		System.out.println("\n성별 구분하기\n주민번호 입력 : ");
		String idnum1 = sc.nextLine();
		char a = idnum1.charAt(8);
		
		String idGender = idGender(a);
		System.out.print("성별은 : " + idGender);

	}

}
















