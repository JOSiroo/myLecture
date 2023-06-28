package com.day4;

public class BitOp {

	public static void main(String[] args) {
		int x = 3; //0011
		int y = 5; //0101
		System.out.println("x는 " + x + "이고, y는 " + y +"일 때, "); 
		System.out.println("x | y = " + (x|y)); //0111 => 7
		System.out.println("x & y = " + (x&y)); //0001 => 1
		System.out.println("x ^ y = " + (x^y)); //0110 => 6
		System.out.println("true | false = " + (true|false)); 
		System.out.println("true & false = " + (true&false)); 
		System.out.println("true ^ false = " + (true^false)); 
	}

}
