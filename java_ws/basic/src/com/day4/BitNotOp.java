package com.day4;

public class BitNotOp {

	public static void main(String[] args) {
		byte b = 10;
		System.out.println("b = " + b );	//00001010
		System.out.println("~b = " + ~b);	//11110101 => -11 (1의 보수)
		System.out.println("~b+1 = " + (~b+1)); //11110110 => -10 (2의 보수)

		
		int num = 1;
		
		String result = (num > 0) ? "양수" : "음수";
	
	
	}

}
