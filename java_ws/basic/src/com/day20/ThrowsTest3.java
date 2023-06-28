package com.day20;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) throws IOException{
		//public abstract int read() throws IOException
		System.out.println("성별 입력 : M/F");
		char gender = (char)System.in.read();

		String result = "";
		switch(Character.toUpperCase(gender)) {
		case'M' :
			result = "남자";
			break;
		case'F' :
			result = "여자";
			break;
		default :
			result = "잘못입력";
		}
		System.out.println(result);
	}

}
