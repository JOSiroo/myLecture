package com.day11;

import java.util.Scanner;

public class JaggedArray_Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[8];
		for(;;) {
			System.out.println("복권 판매점 번호 <1 ~ 8>와 복권 판매량을 입력하세요.\n<끝낼때는 Q>");
			String sales1 = sc.nextLine();
			if(sales1.equalsIgnoreCase("Q")){
				break;
			}
			int sales = Integer.parseInt(sales1);
			int qty = sc.nextInt();
			lotto[sales-1] += qty; 
			
			
			System.out.println("그룹번호 : " + sales + ", 판매량 : " + lotto[sales-1]);
			sc.nextLine();
		}
	}
}
