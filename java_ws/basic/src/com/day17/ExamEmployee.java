package com.day17;

import java.util.Scanner;

class Employee{	
	protected String name;

	public Employee(String name){
		this.name = name;
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public String getName(){
			return this.name;
	}
	
	public int findPay(){
		return 0;
	}
}//

class Permanent extends Employee{	
	protected int salary; //기본급여

	public Permanent(String name, int salary){
		super(name);
		this.salary = salary;
	}	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int findPay(){
		return salary;
	}	
}//

class Temporary extends Employee{	
	private int time; //일한시간
	private int pay;  //시간당 급여

	public Temporary(String name, int time, int pay){
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
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int findPay(){
		return time*pay;
	}	
}//

class SalesPerson extends Permanent{	
	private final double RATE = 0.15;

	private int earnings; //판매수익

	public SalesPerson(String name, int salary, int earnings){
		super(name, salary);
		this.earnings = earnings;
	}
		
	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public int findPay(){
		return (int)(salary+(earnings*RATE));
	}
}//

public class ExamEmployee {
	public static void main(String[] args){
		//Employee배열 - 요소 3개 넣고,
		// 1) 모든 직원의 findPay() 메서드 호출
		// 2) 자식만의 메서드 getSalary(), getTime(), getEarnings() 호출
		// for, 확장 for 이용
		//Permanent, Temporary-SalesPerson
		
		//모든 직원의 findPay 호출
		Employee[] arr = new Employee[3];
		arr[0] = new Permanent("Permanent", 10000);
		arr[1] = new Temporary("Temporary", 10, 10000);
		arr[2] = new SalesPerson("SalesPerson", 20000, 123456);
		
		for(Employee em : arr) {
			System.out.println(em.name + "의 findPay = " + em.findPay());
		}
		
		System.out.println("===========================================");
		
		//자식만의 메소드 호출
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Permanent && !(arr[i] instanceof SalesPerson)) {
				Permanent p = (Permanent)arr[i];
				System.out.println("p.getSalary() = " + p.getSalary()); 
			}else if(arr[i] instanceof Temporary) {
				Temporary t = (Temporary)arr[i];
				System.out.println("t.getTime() = " + t.getTime());
			}else if(arr[i] instanceof SalesPerson) {
				SalesPerson s = (SalesPerson)arr[i];
				
				System.out.println("s.getEarnings() = " + s.getEarnings());
			}
		}
	
	}
}
