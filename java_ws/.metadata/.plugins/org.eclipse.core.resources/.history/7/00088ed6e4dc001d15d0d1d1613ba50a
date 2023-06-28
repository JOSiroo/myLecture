package com.day23;

import java.util.Calendar;

public class CalendarTest1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		
		System.out.print(year + "년 " + (month+1) + "월 " + cal.get(Calendar.DATE) + "일 ");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시 " + cal.get(Calendar.MINUTE) + "분 "
								+ cal.get(Calendar.SECOND) + "초" );
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		String result = "";
		switch(weekday) {
		case 1 : result = "일요일"; break;
		case 2 : result = "월요일"; break;
		case 3 : result = "화요일"; break;
		case 4 : result = "수요일"; break;
		case 5 : result = "목요일"; break;
		case 6 : result = "금요일"; break;
		case 7 : result = "토요일"; break;
		}
		System.out.println("요일 : " + result);
	}

}
