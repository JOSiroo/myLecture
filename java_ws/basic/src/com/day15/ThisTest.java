package com.day15;

class Car{
	/*
	 	1) this.멤버 - 자신의 멤버를 참조하는 this
	 	2) this() 	- 생성자를 호출하는 this(), 같은 클래스의 다른 생성자를 호출할 때 사용
	 				한 생성자에서 다른 생성자를 호출할 때는 반드시 첫줄에서만 호출 가능 
	
	*/
	
	private String color;		//색상
	private String gearType;	//변속기 종류 - auto, manual(수동)
	private int door;			//문의 개수
	
	Car(){
		this("white", "auto", 4);
		//this.color = "white";
		//this.gearType = "auto";
		//this.door = 4;
	}
	
	Car(String color){
		this(color, "auto", 4);
	
		
	}
	
	Car(String color, String gearType, int door){
		//this(color, gearType, door)
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public void showInfo() {
		System.out.println("color = " + color + ", geartype = " + gearType + ", door = " + door); 
	}
	
}

public class ThisTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.showInfo();

		System.out.println("=================================");
		
		Car c2 = new Car("Black");
		c2.showInfo();
		
		System.out.println("=================================");

		Car c3 = new Car("Red,", "Manual", 2);
		c3.showInfo();
		
		
	}

}
