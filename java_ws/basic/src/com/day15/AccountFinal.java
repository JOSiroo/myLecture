package com.day15;

import java.util.Scanner;

class Account{
	private final static double INTEREST_RETE = 0.02;
	
	public static double getInterestRete() {
		return INTEREST_RETE;
	}

	public static double result(int money) {
		return money*INTEREST_RETE;
	}
}

public class AccountFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요");
		int money = sc.nextInt();
		System.out.println("=================================");
		double result = Account.result(money);
		System.out.println("원금 : " + money + ", 이자율 : " + Account.getInterestRete() + ", 이자 : " + (int)result);
	}

}
