package com.day23;

import java.util.Calendar;
import java.util.Date;

public class CalendarDateTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(1990, 6, 15);
		int days = (int)((cal.getTimeInMillis() - cal2.getTimeInMillis())/1000)/(24*60*60);
		System.out.println("생일 <1990년 07월 15일> 이후 경과일수 : " + days + "일");
		
		Date d = cal.getTime();
		Date d1 = new Date();
		Date d2 = new Date(2023-1900, 07, 25);
		System.out.println(((d2.getTime() - d1.getTime())/1000)/(24*60*60));
		
		cal2.set(2023, 7,25);
		days = (int)((cal2.getTimeInMillis() - d.getTime())/1000)/(24*60*60);
		System.out.println("수료일까지 남은 일수 : " + days + "일");
		
		cal2.set(2023, 6, 28);
		cal2.add(Calendar.DATE, 100);
		System.out.println("7/28 부터 100일 후 : " + CalendarTest2.showDate(cal2));
	}

}
