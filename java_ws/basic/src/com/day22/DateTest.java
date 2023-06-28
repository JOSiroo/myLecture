package com.day22;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();	//현재 날짜
		System.out.println("d = " + d);
		System.out.println("현재 날짜 : " + d.toLocaleString());
		
		
		int year = d.getYear();
		int month = d.getMonth();
		
		System.out.println(year + 1900 + "년");
		System.out.println(month + 1 + "월");
		System.out.println(d.getDate() + "일");
		System.out.println(d.getHours() + "시 " + d.getMinutes() + "분 " + d.getSeconds() + "초");
		System.out.println("요일 : " + d.getDay());
		
		//현재의 시간을 1970년 1월 1일 0시 0분 0초를 기준으로 밀리초 단위로 환산
		long l = d.getTime()/1000;
		long l1 = l/(365*24*60*60);
		System.out.println("70/01/01 이후 경과된 시간 (초) : " + l);
		
		l = l/(24*60*60);	//일
		System.out.println("70/01/01 이후 경과된 일수 : " + l);
		System.out.println("70/01/01 이후 경과된 년수 : " + l1);
	}

}
