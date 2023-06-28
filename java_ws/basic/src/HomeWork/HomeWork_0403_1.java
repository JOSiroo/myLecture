package HomeWork;

import java.util.Scanner;

class Account1{
	protected String accNum;
	protected int balance;
	
	Account1(String accNum, int balance){
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("계좌번호 : " + accNum);
		System.out.println("계좌잔액 : " + balance);
	}
}
class KBAccount1 extends Account1{
	private int limit;
	
	KBAccount1(String accNum, int balance, int limit){
		super(accNum, balance);
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void display() {
		super.display();
		System.out.println("이체한도 : " + limit);
	}
}

public class HomeWork_0403_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호, 잔액, 이체한도를 입력하세요.");
		String accNum = sc.nextLine();
		int balance = sc.nextInt();
		int limit = sc.nextInt();
		
		KBAccount1 KBA = new KBAccount1(accNum, balance, limit);
		System.out.println("==================================");
		KBA.display();
	}

}
