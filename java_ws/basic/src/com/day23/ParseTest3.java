package com.day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ParseTest3 {

	public static void main(String[] args) throws ParseException {
		//1번
		
		
		//2~3번
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("날짜를 입력하세요<2013/09/30>");
		String day = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy년 MM월 dd일 E");
		Date d = sdf.parse(day);
		
		String result2 = sdf3.format(d);
		System.out.println(result2);
		
		//4번
		Date d2 = new Date();
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd E요일 hh:mm:ss a");
		System.out.println(sdf4.format(d2));
		





	}

}
