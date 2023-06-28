package com.day23.ETC;

public class StringBuilderTest {

	public static void main(String[] args) {
		//public StringBuilder append(String str)
		//public StringBuilder insert(int offset, int i)
		/*
		 	String 	- 변경이 불가능한 문자열의 표현을 위한 클래스
		 			- 한번 만들어지면 더이상 그 값을 바꿀 수 없다
		 			- 문자열을 더하거나 새로운 문자열을 넣으면 새로운 String객체가 생성되고,
		 				기존 객체는 버려짐
		 	StringBuffer, StringBuilder - 변경이 가능한 문자열의 표현을 위한 클래스
			StringBuilder	- Thread safe 하지 않다, 속도는 더 빠름. JDK5.0에 추가
		*/
		
		StringBuilder sb = new StringBuilder("AB");
		sb.append(25);
		sb.append('Y');sb.append(true);
		System.out.println(sb);
		
		sb.insert(2, false);
		sb.insert(sb.length(), 'Z');
		System.out.println(sb);
		
		// 1. String을 StringBuilder로 변환
		String str = "java";
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2);
		

		// 2. StringBuilder를 String으로 변환
		StringBuilder sb3 = new StringBuilder("스프링");
		String s = sb3.toString();
		System.out.println(s);
	}

}














