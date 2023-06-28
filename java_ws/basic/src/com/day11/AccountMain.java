package com.day11;

public class AccountMain {

	public static void main(String[] args) {
		// 1. 객체 생성 - 해당 클래스의 멤버변수와 메서드를 메모리에 할당
		Account acc;
		acc = new Account();
		
		// 2. 메소드 사용
		acc.showInfo();//멤버변수는 default값으로 초기화됨
		
		//두번째 객체 생성
		Account acc2 = new Account();
		
		//멤버변수 사용
		acc2.accId = "100-001-2000";
		acc2.name = "홍길동";
		acc2.balance = 100000;
		
		//메222서드 사용
		acc2.withdraw(30000); //30000원 출금
		acc2.showInfo();
		
		acc2.deposit(50000); //50000원 입금
		System.out.println("현재잔액 : " + acc2.balance);
		
		
		/*
		 	클래스는 실체(객체)가 아닌 틀이므로 클래스 안에 존재하는 변수에 접근하고
		 	메서드를 호출하기 위해서는 클래스를 실체화(객체화)시켜야 함
		 	
		 	객체 생성방법
		 	클래스이름 변수명 = new 클래스이름();
		 	예) Account acc = new Account();
		 	acc => 참조변수, acc를 통해서 각각의 객체에 접근 할 수 있게 됨
			
			acc.withdraw(30000); //.연산자를 이용해서 객체의 변수나 메서드에 접근
		*/
		
	}

}
