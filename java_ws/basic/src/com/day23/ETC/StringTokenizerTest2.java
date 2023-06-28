package com.day23.ETC;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
		String str = "1,홍길동,100,90,80|2,김길동,95,85,75|3,이길동,88,77,66";
		String str2 = "1,홍길동,100,90,80|2,김길동,95,85,75|3,이길동,88,77,66";

		String[] arr = str.split("\\|");
		for(String s : arr) {
			String[] arr2 = s.split(",");
			for(String s1 : arr2) {
				System.out.print(s1 + "\t");
			}
			System.out.println(" ");
		}
		
		StringTokenizer stk = new StringTokenizer(str, "|");
		while(stk.hasMoreTokens()) {
			String token = stk.nextToken();
//			System.out.println(token);

			StringTokenizer stk2 = new StringTokenizer(token, ",");
			while(stk2.hasMoreTokens()) {
				String s = stk2.nextToken();
				System.out.print(s + "  ");
			}
			System.out.println("\n");
		}
		
	}
}
