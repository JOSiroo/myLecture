package com.day5;

import java.util.Scanner;

public class OverlapIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원여부 입력(1.회원 2.비회원)");
		long flag = sc.nextLong();
		String gift = ""; //사은품
		
		if(flag == 1) { //회원인 경우
			System.out.println("회원이 구매한 금액을 입력하세요");
			long price = sc.nextLong();
			if(price >= 1000000) {
				gift = "외장하드";
			}else if(price >= 500000) {
				gift = "스피커";
			}else if(price >= 100000) {
				gift = "마우스";
			}else {
				gift = "10만원 미만은 사은품이 없습니다";
			}
		}else {	//비회원인 경우
			gift = "비회원은 사은품 증정 불가";			
		}
		
		System.out.println("증정품 : " + gift);
		
	}

}
