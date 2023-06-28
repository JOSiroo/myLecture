package com.day5;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요");
		String input = sc.nextLine();
		double score = Double.parseDouble(input);
		
		String result = "";
		if(score >= 0 && score <= 100) {
			result = "학점 : A";
			 if(score >= 80 && score <= 90) {	
				result = "학점 : B";
			}else if(score >= 70 && score <= 80) {
				result = "학점 : C";
			}else if(score >= 50 && score <= 70) {
				result = "학점 : D";
			}else {
				result = "학점 : F";
			} // 여기까지 안쪽 if
		}else {
			result = "잘못입력";
		} // 바깥 if
		
		System.out.println("평균 : " + score + "\n" +  result);
		
		/*
		 	중첩 if 문
		 		- if문이 중복으로 사용된 것
		 		- 바깥쪽 if문이 참이 되어야 안쪽 if문을 수행함
		 		if(조건식){
		 			if(조건식2){
		 				문장;
		 			}
		 		}
		 */

	}

}
