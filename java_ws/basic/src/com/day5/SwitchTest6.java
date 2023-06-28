package com.day5;

import java.util.Scanner;

public class SwitchTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요");
		double avg = sc.nextDouble();
		
		String grade = "";
		switch((int)avg/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}//switch
		System.out.println(avg + " => "  + grade);
		
		int n = 564564;
			//String res = (n > 0) ? "양수" : "음수";
		String res = (n > 0) ? "양수" : (n == 0) ? "0" : "음수";
		System.out.println(res);
		
	}
	
	

}
