package com.day22;

public class StringTest1 {

	public static void main(String[] args) {
	/*
		indexOf() - 특정 문자의 위치를 찾아내는 메서드
		substring() - 일부 문자열 추출
	*/
		
		//			  01234567890123456789012
		String str = "Hello Java, Hi Java!";
		char ch = str.charAt(4);
		System.out.println("ch = " + ch);
		
		int idx = str.indexOf("Java");
		System.out.println("앞에서 Java의 위치 : " + idx);
		System.out.println("뒤에서 Java의 위치 : " + str.lastIndexOf("Java"));
		
		String sub = str.substring(6, 10);
		System.out.println("sub = " + sub);
		
		sub = str.substring(12);	//12부터 끝까지 추출
		System.out.println("sub = " + sub);
		
		String str1 = "www.naver.com";
		if(str1.endsWith(".com")) {
			System.out.println(".com site 입니다.");
		}
		
		if(str1.startsWith("www")) {
			System.out.println("www로 시작합니다.");
		}
		String email = "hong@gmail.com";	//go@nate.com
		if(email.indexOf("@") != 1 && email.indexOf(".") != -1
				&& email.indexOf("@") < email.indexOf(".")) {
			System.out.println("이메일 규칙이 올바릅니다");
		}else {
			System.out.println("이메일 규칙이 올바르지 않습니다");
		}
		
		//hong, go
		int idx1 = email.indexOf("@");	// @의 위치
		int idx2 = email.indexOf(".");	// .의 위치
		
		String emailSub1 = email.substring(0, idx1);	//0부터 @Rkwl
	
		//gamil, nate
		String emailSub2 = email.substring(idx1+1, idx2);	// @의 위치+1부터 .까지
		//com
		String emailSub3 = email.substring(idx2 + 1);	// .의 위치+1부터 끝까지
		System.out.println("emailSub1 = " + emailSub1);
		System.out.println("emailSub2 = " + emailSub2);
		System.out.println("emailSub3 = " + emailSub3 + "/n");

		
		String s= "		Java Spring ";
		String s2 = s.trim(); // 양쪽 공백 제거
		System.out.println("s = |" + s + "|");
		System.out.println("s2 = |" + s2 + "|");
		System.out.println("s의 길이 : " + s.length());
		System.out.println("s2의 길이 : " + s2.length());
		
		int x = 10, y=20;
		String ss = String.valueOf(x);
		String ss2 = Integer.toString(y);
		System.out.println(ss + y);
		System.out.println(ss2 + y);
	}

}
