package HomeWork_0416;

import java.util.ArrayList;
import java.util.Scanner;

interface SpecialRate{
	final double RANK_A = 0.03;
	final double RANK_B = 0.02;
	final double RANK_C = 0.01;
}

class Account implements SpecialRate{
	protected String accNum;
	protected String name;
	protected int balance;

	Account(String accNum, String name, int balance){
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		if(money > balance) {
			System.out.println("잔액 부족");
		}else {
			balance -= money;
		}
	}
	public String toString() {
		return " Name = " + name + ", AccountNum = " + accNum + ", Balance = " + balance + " ";
	}
}

class NormalAccount extends Account{
	protected double RATE;

	NormalAccount(String accNum, String name, int balance, double RATE){
		super(accNum, name, balance);
		this.RATE = RATE*0.01;
		this.balance += (balance*this.RATE);
	}

	@Override
	public void deposit(int money) {
		this.balance += money + (money*RATE);
	}
	@Override
	public void withdraw(int money) {
		super.withdraw(money);
	}

	@Override
	public String toString() {
		return " AccountNum = " + name + "\n Name = " + accNum + "\n Balance = " + balance + "\n Rate = " + (int)(RATE*100) + "%" ;
	}
}

class HighCreditAccount extends NormalAccount implements SpecialRate{
	private double SPECIAL_RATE;

	HighCreditAccount(String accNum, String name, int balance, int sr, double RATE){
		super(accNum, name, balance, RATE);
		this.RATE = RATE*0.01;
		switch(sr) {
		case 1:
			SPECIAL_RATE = RANK_A;
			break;
		case 2:
			SPECIAL_RATE = RANK_B;
			break;
		case 3:
			SPECIAL_RATE = RANK_C;
			break;
		}
		balance += (balance*this.RATE) + (balance*SPECIAL_RATE);
		this.balance = balance; // 수정된 balance 값을 저장	
	}
	public void deposit(int money) {
		this.balance += money + (money*SPECIAL_RATE)+(money*RATE);
	}
	@Override
	public void withdraw(int money) {
		super.withdraw(money);
	}
	@Override
	public String toString() {
		return " AccountNum = " + name + "\n Name = " + accNum + "\n Balance = " + balance + "\n Rate = " + (int)(RATE*100) +  "%\n SPECIAL_RATE = " + (int)(SPECIAL_RATE*100) + "%";
	}
}
public class HomeWork_0416 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<>();

		for(;;) {
			System.out.println("----------Menu----------");
			System.out.println("1. 계좌개설");
			System.out.println("2. 입   금");
			System.out.println("3. 출   금");
			System.out.println("4. 계좌정보 전체 출력");
			System.out.println("5. 프로그램 종료");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				System.out.println("[ 계좌 종류 선택 ]");
				System.out.println("1. 보통 예금 계좌");
				System.out.println("2. 신용 신뢰 계좌");
				int choice = sc.nextInt();
				sc.nextLine();
				if(choice == 1) {
					System.out.print("계좌 ID : ");
					String accNum = sc.nextLine();
					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.print("입금액 : ");
					int balance = sc.nextInt();
					System.out.print("이자율 : ");
					double rate = sc.nextDouble();
					sc.nextLine();
					list.add(new NormalAccount(accNum, name, balance, rate));
				}else if(choice == 2) {
					System.out.print("계좌 ID : ");
					String accNum = sc.nextLine();
					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.print("입금액 : ");
					int balance = sc.nextInt();
					System.out.print("이자율 : ");
					double rate = sc.nextDouble();
					System.out.print("신용등급< 1toA, 2toB, 3toC > : ");
					int specialRate = sc.nextInt();
					sc.nextLine();
					list.add(new HighCreditAccount(accNum, name, balance, specialRate, rate));
				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("[ 입 금 ]");
				System.out.print("계좌 ID : ");
				String name = sc.nextLine();
				for(int i = 0; i < list.size(); i++) {
					if(name.equals(list.get(i).accNum)) {
						System.out.print("입금액 : ");
						int money = sc.nextInt();
						list.get(i).deposit(money);
						System.out.println("입금 완료");
					}else {
						System.out.println("없는 사용자");
					}
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("[ 출 금 ]");
				System.out.print("계좌 ID : ");
				sc.nextLine();
				name = sc.nextLine();
				for(int i = 0; i < list.size(); i++) {
					if(name.equals(list.get(i).accNum)) {
						System.out.print("출금 : ");
						int money = sc.nextInt();
						list.get(i).withdraw(money);
						System.out.println("출금 완료");
					}else {
						System.out.println("없는 사용자");
					}
				}
				break;
			case 4:
				System.out.println("========== 전체 고객 계좌 정보 ==========");
				for(Account a : list) {
					System.out.println(a.toString());
					System.out.println("");
				}
				System.out.println("=====================================");
				sc.nextLine();
				break;

			case 5:
				System.out.println("종료합니다.");
				return;
			}




		}
	}

}
