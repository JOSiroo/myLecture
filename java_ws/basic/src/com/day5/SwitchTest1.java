package com.day5;

public class SwitchTest1 {

	public static void main(String[] args) {
		/*
		 	switch문
		 	- 비교할 조건이 많은 경우, 정해져 있는 값을 가진 경우(== 비교인 경우)사용
		 	- 비교연산(>,<)이 올 수없다.
		 	
		 	switch(제어변수) {
		 		case 값1;
		 			문장1;
		 			break;
		 		case 값2;
		 			문장2;
		 			break;
		 		default;
		 			문장3;
		 	}
		 	
		 	=> 제어변수에 해당하는 값이 값1이면 문장1을 수행하고
		 		값2이면 문장2를 수행하고
		 		그렇지 않으면 문장3을 수행한다.
		 	case문에는 반드시 break를 써서 해당 case문을 벗어나게 해야 한다.
		 	
		 	제어변수 : byte, short, int, char자료형만 사용가능
		 			jdk 7.0 이상에서는 String도 사용가능
		*/
		//if문
		int n = 3;
		String result = "";
		if(n == 1) {
			result = "one";
		}else if(n == 2) {
			result = "two";
		}else if(n == 3) {
			result = "three";
		}else {
			result = "그외의 숫자!";
		}
		
		System.out.println(n + " => " + result);
		
		//switch
		switch(n) {
			case 1:
				result = "하나";
				break;
			case 2:
				result = "둘";
				break;
			case 3:
				result = "셋";
				break;
			default:
				result = "그 외의 숫자임!";
		}//switch

		System.out.println(result);
		
	}

}















