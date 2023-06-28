package com.day10;

import java.util.Arrays;
import java.util.Scanner;

public class Array_lotto {
	
	public static int[] lotto() {
		int[] num=new int[6];
		for(int i=0;i<num.length;i++) {
			//2-1. 1~45사이의 임의의 숫자 뽑기
			int temp=(int)(Math.random()*45+1);
			
			//2-2. 배열에 저장
			num[i]=temp;
			
			//2-3. 중복 제거
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					i--; //다시 뽑도록 i값을 1 감소
					break;
				}
			}//안쪽 for
		}//바깥 for
		
		return num;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("게임 시작");
		//6자리 배열 선언
		int[] lotNum = new int[6];
		//for이용 1~45 6번 뽑기
		for(;;) {
			System.out.println("숫자 뽑기\n그만하려면 \"Q\" 입력");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("Q")) break;
			int randomVal = 0;
				for(int i = 0; i < lotNum.length; i++) {
					randomVal = (int)(Math.random()*45+1);
		
					lotNum[i] = randomVal;	
					for(int j = 0; j < i; j++) {
						if(lotNum[j] == lotNum[i]) {i--; break;} 
					}//안쪽for
				}//바깥for
				Arrays.sort(lotNum);
				
				for(int l : lotNum) {
					System.out.print(l + " ");
				}//결과출력
				System.out.println("\n");
		}//무한루프
		
		
		
		
	}

}
