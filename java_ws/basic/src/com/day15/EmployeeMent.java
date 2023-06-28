package com.day15;

import java.util.Scanner;

class Employee{
	protected String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Employee(String name){
		this.name = name;
	}
	public int findPay() {
		return 0;
	}
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
}

class Permanent extends Employee{
	private int salary;
	private int bonus;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	Permanent(String name, int salary, int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public int findPay() {
		return salary+bonus;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("기본급여 : " + salary);
		System.out.println("보너스 : " + bonus);
	}
}

class Temporary extends Employee{
	private int time;
	private int pay;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}
	
	public int findPay() {
		return time*pay;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("일한시간 : " + time);
		System.out.println("시간당 급여 : " + pay);
	}
	
}
public class EmployeeMent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직<P>, 임시직<T>을 입력하세요");
		String menu = sc.nextLine();
		
		if(menu.equalsIgnoreCase("p")) {
			System.out.println("이름, 기본급여, 보너스를 입력하세요");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			int bonus = sc.nextInt();
			Permanent pm = new Permanent(name, salary, bonus);

			System.out.println("-------------------------------------------");
			System.out.println("고용형태 : 고용직");
			pm.showInfo();
			int pay = pm.findPay();
			System.out.println("급여 : " + pay);

		}else if(menu.equalsIgnoreCase("T")) { 	
			System.out.println("이름, 일한시간, 시간당 급여를 입력하세요");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			Temporary tem = new Temporary(name, time, pay);

			System.out.println("-------------------------------------------");
			System.out.println("고용형태 : 임시직");
			tem.showInfo();
			int pay1 = tem.findPay();
			System.out.println("급여 : " + pay1);
		}
	}

}
