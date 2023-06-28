package com.day23;

import java.text.DecimalFormat;

public class DecimalTest {

	public static void main(String[] args) {
		double num = 1234567.89512;
		
		DecimalFormat df =  new DecimalFormat("#,###.##");
		String str = df.format(num);
		System.out.println(str);
		
		DecimalFormat df2 =  new DecimalFormat("#,###.00");
		str = df2.format(num);
		System.out.println(str);
		
		DecimalFormat df3 =  new DecimalFormat("#,###");
		str = df3.format(num);
		System.out.println(str);
		
		//String format(double number)
		//숫자 => 형식화된 문자열로 변환
	}

}
