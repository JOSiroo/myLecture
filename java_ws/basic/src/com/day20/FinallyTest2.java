package com.day20;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try{
			int result = n1/n2;
			System.out.println("나눗셈 결과 : " + result);
			return true;
		}catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
			return false;
		}finally {
			System.out.println("반드시 실행되어야 함! - finally");
		}
	}
	/*
	 	중간에 return을 하더라도 finally 영역은 실행되고 나서 메서드를 빠져 나가게 됨
	 */
	
	
	public static void main(String[] args) {
		if(divider(7,3)) {
			System.out.println("연산 성공!!\n");
		}else {
			System.out.println("연산 실패!!\n");
		}
		
		if(divider(8, 0)) {
			System.out.println("연산 성공!!\n");
			
		}else {
			System.out.println("연산 실패!!\n");
		}
	}

}
