package HomeWork;
/*
import java.util.Scanner;
class Account {
	protected String accNo;
	protected double balance;
	
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance; 
	}
	
	public void deposit(double money)  {
		balance += money; 
	}

	public void withdraw(double money) {
		balance -= money; 
	}
	public void display() {
		System.out.println("계좌번호:"+accNo);
		System.out.println("계좌잔액:"+(int)balance); 
	}

}

class FaithAccount extends Account{
	
	 FaithAccount(String accountNum, int balance) {
		 super(accountNum, balance + (int)(balance*0.01));
	 }
	 
	 public void deposit(double money) {
		 int deposit = (int)(money+money*0.01);
		 balance += deposit;
	 }
}

class ContriAccount extends Account{
	private static int contribution;
	
	ContriAccount(String accountNum, int balance){
		super(accountNum, balance - (int)(balance*0.01));
		this.contribution = (int)(balance*0.01);
	}

	public void deposit(double money) {
		int deposit = (int)(money - money * 0.01);
		balance += deposit;
		contribution += money * 0.01;
	}
	
	public void display() {
		super.display();
		System.out.println("총 기부액 : " + contribution);
	}


}

public class HomeWork_0405_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----개설할 계좌종류----");
		System.out.println("일반계좌[A] 신용계좌[F] 기부계좌[C] 계좌번호, 잔액을 입하세요 ");
		String accType = sc.nextLine();
		String accNum = sc.nextLine();
		int balance = sc.nextInt();
		Account acc = null;
		System.out.println("================================");
		
		if(accType.equalsIgnoreCase("A")) {
			acc = new Account(accNum, balance);
		}else if(accType.equalsIgnoreCase("F")) {
			acc = new FaithAccount(accNum, balance);
		}else if(accType.equalsIgnoreCase("C")) {
			acc = new ContriAccount(accNum, balance);
		}else {
			System.out.println("잘못입력");
		}
		acc.display();
		System.out.println("입금 할 금액을 입력하세요 ");
		double deposit = sc.nextInt();
		acc.deposit(deposit);
		acc.display();
	
	}

}
*/