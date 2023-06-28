package com.day4.condition;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine();
		
		boolean bool1 = id.equals("hong");
		boolean bool2 = pw.equals("1234");
		
		String result = "";
		
		if(bool1 && bool2) {
			result = "로그인 되었습니다";
		}else {
			result = "아이디나 비밀번호가 틀렸습니다!!";
		}
		
		System.out.println(result);
	}

}
