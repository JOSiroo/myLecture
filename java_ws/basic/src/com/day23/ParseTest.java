package com.day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		//public Date parse(String source) throws ParseException - 문자열을 날짜로 변환
		//사용자가 입력한 날짜와 오늘날짜 사이의 간격 구하기
		// => 사용자가 입력한 문자열 형식의 날짜를 Date로 변환해야함
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 이전 날짜 입력! (2023-01-01) 형식으로");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(str);	// 사용자 입력 날짜
			Date today = new Date();
			System.out.println("d = " + d.toLocaleString() + ", today = " + today.toLocaleString());
			long gap = (today.getTime() - d.getTime())/1000;	//초
			gap = gap/(24*60*60);
			System.out.println("두 날짜 사이의 간격 : " + gap);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
