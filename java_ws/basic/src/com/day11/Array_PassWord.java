package com.day11;

import java.util.Scanner;

public class Array_PassWord {

	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
			// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String result = "";

		System.out.println("문자 입력");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(str + " : ");
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
			result += abcCode[ch-'a'];
			//ch = abcCode[ch-'a'];
			//result = Character.toString(ch);
			}else if(ch >= '0' && ch <= '9') {
			result += numCode[ch - '0'];
			//ch = numCode[ch-'0'];
			//result = Character.toString(ch);
			}
		}
		System.out.print(result);
		

	}

}
