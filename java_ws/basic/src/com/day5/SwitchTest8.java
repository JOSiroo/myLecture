package com.day5;

import java.io.IOException;

public class SwitchTest8 {

	public static void main(String[] args) throws IOException{
		//public static char toUpperCase(char ch)
		System.out.println("직업을 입력하세요\nA. 회사원 B. 학생 C. 주부 D. 기타");
		//int input = System.in.read();
		char input = (char)System.in.read();
		char job1 = Character.toUpperCase((char)input);
		String result = "";
		
		switch((job1)) {
		case 'A' :
			result = "회사원이시군요";
			break;
		case 'B' :
			result = "학생이시군요";
			break;
		case 'C' :
			result = "주부이시군요";
			break;
		case 'D' :
			result = "기타를 선택했어요";
			break;
			default :
				result = "잘못 입력했어요";
				break;
		}
		System.out.println(result);

	}

}
