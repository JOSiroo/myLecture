package com.day4.condition;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요 M/F");
		String gender = sc.nextLine();
		
		
		//public boolean equals(String anObject)
		boolean bool = gender.equals("M");
		
		/*
		 	기본자료형에서 등가 연산자(==)는 값을 비교
		 	참조형에서 등가연산자는 주소값을 바교
		 	★문자열의 내용(값)을 비교하려면 String클래스의 equals() 메서드 이용★
		*/
		
		
		String result = "";
		//if(gender == "M") { // 값을 비교하지 않고 주소를 비교함 => 원하는 결과가 안나옴
								//String은 참조형
		if(gender.equals("M") || gender.equals("m")) {
			result = "남자";
		}else if(gender.equals("F") || gender.equals("f")){
			result = "여자";
		}else {
			result = "잘못입력!";
		}
		System.out.println(result);
		
		
		//public String toUpperCase()
		String upperGender = gender.toUpperCase();
		if(upperGender.equals("M")) {
			result = "남자";
		}else if(gender.toUpperCase().equals("F")) {
			result = "여자";
		}else {
			result = "잘못 입력!";
		}
		System.out.println(result);

		//public boolean equalsIgnoreCase(String anotherString)

		if(gender.equalsIgnoreCase("M")) {
			result = "남자";
		}else if(gender.equalsIgnoreCase("F")) {
			result = "여자";
		}else {
			result = "잘못 입력!";
		}
		System.out.println(result);
		
		

	}

}
