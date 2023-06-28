package HomeWork;

import java.util.Scanner;


class Account{
	private int accountNum;
	private int balance;
	
	//getter/setter
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class KBAccount extends Account{
	private int limit;
	
	//getter/setter
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void showInfo() {
		System.out.println("계좌번호 : " + getAccountNum());
		System.out.println("계좌잔액 : " + getBalance());
		System.out.println("이체한도 : " + limit);
	}
}

public class HomeWork_0402_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호, 계좌잔액, 이체한도를 입력하시오 ");
		int accountNum = sc.nextInt();
		int balance = sc.nextInt();
		int limit = sc.nextInt();
		System.out.println("=============================");
		KBAccount KBA = new KBAccount();
		KBA.setAccountNum(accountNum);
		KBA.setBalance(balance);
		KBA.setLimit(limit);
		
		KBA.showInfo();
	}

}
