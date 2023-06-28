package com.day4;

public class IncrementOp2 {

	public static void main(String[] args) {
		//수식에 포함되는 경우
		int i = 5;
		int k = 0;
		k = i++;
		
		System.out.println("후증가 실행 후, i = " + i + ", k = " + k);
		
		i = 5;
		k = 0;
		k = ++i;
		System.out.println("선증가 실행 후, i = " + i + ", k = " + k);
	}

}
