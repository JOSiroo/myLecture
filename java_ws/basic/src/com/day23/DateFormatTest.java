package com.day23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		//public final String format(Date date)
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 0, 12);
		
		Date d = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 0 ~ 23시
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss a");//	1 ~ 12시
		
		//public final String format(Date date)	: 날짜 => 형식화된 문자열로
		String str = sdf.format(d);
		System.out.println(str);
		
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		
		
	
	
	}

}
