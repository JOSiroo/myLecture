package com.day13;

import java.util.Scanner;

class Account{
		   //멤버 변수
		   private String accId; //계좌번호
		   private int balance; //잔액
	
		   //생성자
		   public Account(String accId, int balance){
		      this.accId=accId;
		      this.balance=balance;
		   }
	
		   //getter/setter
		   public String getAccId(){
		      return accId;
		   }
	
		   public void setAccId(String accId){
		      this.accId=accId;
		   }
	
		   public int getBalance(){
		      return balance;
		   }
	
		   public void setBalance(int balance){
		      this.balance=balance;
		   }
	
		   //메서드
		   public void deposit(int money){//입금
		      balance += money;
		   }
	
		   public void withdraw(int money){//출금
		      balance -= money;
		   }
	
		   //계좌정보를 출력하는 메서드
		   public void display(){
		      System.out.println("계좌번호 : " + accId);
		      System.out.println("잔액 :" + balance+"\n");
		   }
		}
	
public class ArrayClassTest {

	public static void main(String[] args) {
		/*
		 	1) int 배열에 임의의 값 넣고 출력 (기본for)
		 	2) String 배열에 임의의 값 넣고 출력(확장for)
		 	{}쓰지 말것!!
		*/

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n============================\n");

		
		String[] sArr = new String[5];
		sArr[0] = "zz";
		sArr[1] = "xx";
		sArr[2] = "cc";
		sArr[3] = "vv";
		sArr[4] = "bb";
		
		for(String b : sArr) {
			System.out.print(b + " ");
		}
	
		Account ac = new Account("aa", 50000);
		ac.withdraw(30000);
		
		/*
		 	각 배열의 자료형에 맞는 데이터 타입을 넣어야 함
		 	int 배열에는 int를 넣는다
		 	String 배열에는 String를 넣는다
		 	Account 배열에는 Account를 넣는다 how?? new로 객체를 생성해서
		*/
	
		Account[] arr1 = new Account[3];
		arr1[0] = new Account("조상혁", 100000);
		arr1[1] = new Account("이충혁", 200000);
		arr1[2] = new Account("정태환", 300000);

		System.out.println("\n=====================\n");
		
		for(int i = 0; i < arr1.length; i ++ ) {
			arr1[i].withdraw(500);
			arr1[i].display();
			System.out.println("---------------------");
		}
		
		
		Account[] arr2 = new Account[3];
		arr2[0] = new Account("aa", 50000);
		
		//
		Account[] accList = new Account[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < accList.length; i++) {
			System.out.println("계좌번호 , 잔액, 출금액을 입력하세요");
			String accId = sc.nextLine();
			int balance = sc.nextInt();
			int money = sc.nextInt();
			sc.nextLine();
			
			accList[i] = new Account(accId, balance);
			accList[i].withdraw(money);
		}
		
		System.out.println("\n=========================\n");
		for(int i = 0; i < accList.length; i++) {
			accList[i].display();
		}
		
		
		
		
		
		
		

	}

}
