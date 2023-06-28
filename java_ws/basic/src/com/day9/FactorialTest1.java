package com.day9;

public class FactorialTest1 {
	/*
	 	재귀 호출(recursive call)
	 		- 메서드의 내부에서 메서드 자기 자신을 다시 호출하는것
	 		- 반복적인 작업을 해야 하는 메서드에 재귀 호출 이용 가능
	*/
	
	public static long factorial(int n) {
		//f(n) = n * f(n-1), 단 f(1)=1
		long result = 0;
		if(n == 1) {
			result = 1;
		}else {
			result = n*factorial(n-1); // 자기 자신을 다시 호출
			/*
			 		4*6
			 		  3*2
			 		  	2*1
			*/
		
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		long result = factorial(4);
		System.out.println("4! = " + result);
		
	}

}
