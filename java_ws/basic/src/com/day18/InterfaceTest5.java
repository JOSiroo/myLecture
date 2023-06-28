package com.day18;

import java.util.Scanner;

abstract class Employee{
	protected String name;
	
	Employee(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract public int getPay();
	abstract public void showInfo();
}

class Permanent extends Employee{
	private int salary;
	private int bonus;
	
	Permanent(String name, int salary, int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
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
	
	public int getPay() {
		return salary + bonus;
	}
	public void showInfo() {
		System.out.println("기본급여 : " + salary + "\n보너스 : " + bonus);
	}
	public void perMethod() {
		System.out.println("고용형태 : 고용직");
	}
}

class Temporary extends Employee{
	private int time;
	private int pay;
	
	Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPay() {
		return time*pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public void showInfo() {
		System.out.println("일한시간 : " + time + "\n시간당 급여 : " + pay);
	}
	public void temMethod() {
		System.out.println("고용형태 : 임시직");
	}

}
public class InterfaceTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[3];
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println("고용형태 - 고용직 <P>, 임시직 <T>을 입력하세요");
			String type = sc.nextLine();
			
			if(type.equalsIgnoreCase("P")) {
				System.out.println("이름, 기본급여, 보너스를 입력하세요");
				String name = sc.nextLine();
				int salary = sc.nextInt();
				int bonus = sc.nextInt();
				emp[i] = new Permanent(name, salary, bonus);
				emp[i].getPay();
			}else if(type.equalsIgnoreCase("T")) {
				System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
				String name = sc.nextLine();
				int time = sc.nextInt();
				int pay = sc.nextInt();
				emp[i] = new Temporary(name, time, pay);
				emp[i].getPay();
			}
			sc.nextLine();
		}//for
		
		System.out.println("=============for=============");
		for(int i = 0; i < emp.length; i++) {
			if(emp[i] instanceof Permanent) {
				Permanent p = (Permanent)emp[i];
				p.perMethod();
				p.showInfo();
				System.out.println("급여 : " + p.getPay());
				System.out.println("");
			}else if(emp[i] instanceof Temporary) {
				Temporary t = (Temporary)emp[i];
				t.temMethod();
				t.showInfo();
				System.out.println("급여 : " + t.getPay());
				System.out.println("");
			}
		}
		System.out.println("=============확장 for=============");
		
		for(Employee y: emp) {
			if(y instanceof Permanent) {
				Permanent p = (Permanent)y;
				p.perMethod();
				p.showInfo();
				System.out.println("급여 : " + p.getPay());
				System.out.println("");
			}else if(y instanceof Temporary) {
				Temporary t = (Temporary)y;
				t.temMethod();
				t.showInfo();
				System.out.println("급여 : " + t.getPay());
				System.out.println("");
			}
		}
		
	}

}
