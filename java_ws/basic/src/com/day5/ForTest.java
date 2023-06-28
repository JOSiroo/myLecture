package com.day5;

public class ForTest {

	public static void main(String[] args) {
		/*
		 	반복문 - 반복적인 작업을 수행할 때 사용
		 	for, while, do~while, 확장 for
		 	
		 	[1] for문
		 	- 반복횟수가 미리 정해진 경우 주로 사용
		 	- 지정된 횟수만큼 반복해서 실행함
		 	
		 	for(초기식; 조건식; 증감식){
		 		반복명령;
		 	}
		 	
		 	초기식은 처음 한번만 실행함
		 */
		/*		
		for (int i = 0; i < 21; i++) {
			System.out.println(i+" Hello java!");
		}//for
		
		for(int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		/*
		/*System.out.println("\n=====1씩 감소=====");
		
		int i = 4;
		
		for(i = 4; i > 0; i--) {
			System.out.println("i =" + i);
			if(i == -1) {
				for(i = 0; i < -7; i--) {
					System.out.println("i="+i);
				}
			}
		}//for
		/*
		
		/*
		  1. Hello java
		  2. Hello java
		  3. Hello java
		 */
		/*
		  for(int i = 0; i < 3; i++) {
		 	System.out.println((i+1) + "Hello java" );
			}
		*/
		/*
		 	1
		 	3
		 	5
		 	7
		 	9
		 */
		for(int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
		
		for(int i = 0; i < 0; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		
	}

}
