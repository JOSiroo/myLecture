package com.day8;

import java.util.Scanner;

public class Method_Test8_NumGame {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 	1~100 사이의 임의의 값을 구한다 - 정답
				int answer = (int)(Math.random() * 100 + 1);
				//2. 	4번 반복처리
				for(int i = 1; i <= 4; i++) {
				//2-1	사용자로부터 숫자 입력받기
					System.out.println("숫자를 입력하세요");
					int num = sc.nextInt();
				//2-2	정답과 사용자값 비교
					String result = "";
					if(num == answer) {
						System.out.println("대박사건!! 정답입니다");
						break;
					}
					if(i == 4) {
						System.out.println("아깝습니다 정답은 : " + answer);
					}else if (i < 3) {
						if(num > answer) {
							result = "너무 큽니다, 조금 더 작은 수를 입력하세요";
						}else {
							result = "더 큰수를 입력하세요";
						}
					}
					//2-3	결과 출력
					System.out.println(result);

				}
		
		
	}

}








		/*
				//public static double random() /Math클래스
				임의의 랜덤값 리턴하는 메서드
				Math.random()
				
				
					1 ~ 32사이의 수 구하기
				1	=< 	X	<	 32 +	1
					이하		미만
							=> 미만이니까 32가 안나옴 그러니까 1을 더해서
							   33미만으로 만들어야 32가 나옴

				0.0 +1 <= x < 1.0 은 double값을 리턴
				
						
						
						
				public static double random()
				
				예) 1 ~ 100 사이의 임의의 정수 구하기
				[1] 각 변에 100을 곱한다
					0.0 * 100 <= Math.random() * 100 < 1.0 * 100
					0.0 <= Math.random() * 100 < 100.0
					
				[2] 각 변에 1을 더한다
					0.0 + 1 <= Math.random() * 100 + 1 < 100.0 + 1
					1.0 <= Math.random() * 100 + 1 < 101.0
					
				[3] 각 변을 int형으로 형변환 한다
					(int)1.0 + 1 <= (int)(Math.random() * 100 + 1) < (int)101.0
					1 <= (int)(Math.random() * 100 + 1) < 101
					
				규칙
				1) 발생시키려는 수의 개수를 각 변에 곱한다
				2) 시작값을 더한다
				3) int로 형변환 한다.
				
				예) B ~ F 사이의 임의의 값 구하기
				66 <= (int)(Math.random() * 5 + 66) <71
		*/
		
		



















