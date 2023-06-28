package com.day4.condition;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요");
		String input = sc.nextLine();
		double score = Double.parseDouble(input);
		String result = "";
		if(score >= 90) {
			result = "학점 : A";
		}else if(score >= 80) {
			result = "학점 : B";
		}else if(score >= 70) {
			result = "학점 : C";
		}else if(score >= 50) {
			result = "학점 : D";
		}else if(score < 49){
			result = "학점 : F";
		}else {
			result = "잘못입력";
		}
		
		System.out.println("평균 : " + score + "\n" +  result);

	}

}
