package com.day6;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 	무한루프 - 무한히 반복
		 	break를 써서 무한루프를 빠져나오게 해야 함
			
			for(;;) {
				반복할 문장;
				
				if(조건) break;
			}
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) { //무한루프
			System.out.println("게임 중 ~ ");
			System.out.println("계속하시겠습니다? (Y/N)");
			String gameYn = sc.nextLine();
			
			if(gameYn.equalsIgnoreCase("N")) {
				System.out.println("게임 종료");
				break; //반복문 탈출
			}
			
		}//for
		
		//홀수, 짝수 출력
		for(;;) {
			System.out.println("숫자 입력!");
			int num = sc.nextInt();	//5 \r\n
			
			String result = "";
			if(num%2==0) {
				result = "짝수";
			}else {
				result = "홀수";
			}//if
			
			System.out.println(result);
			System.out.println("그만하려면 Q 입력!");
			sc.nextLine(); //\r\n						//sc.nextInt() 엔터 입력한게	문자로 받음
			String quit = sc.nextLine();				//sc.nextLine()에 엔터값이 입력됨	줄로 받음
			if(quit.equalsIgnoreCase("Q")) {
				System.out.println("게임종료");
				break;
			}
			
			
		}//for
		
		

	}

}
