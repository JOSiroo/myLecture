package com.day15;

/*
  클래스를 재사용하는 방법
  	1) 상속이용 - is a 관계가 성립하면 상속을 한다
  	~ is a ~ => ~는 일종의 ~이다
  	예) SportsCar is a Car
  	
  	2) 포함관계 이용 - has a 관계가 성립하면 포합관계를 이용한다
	~ has a ~ => ~는 ~를 가지고 있다
	예) Circle has a Point
*/

class Point3{
	int x, y;
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
}
//포함관계 이용
class Circle2{
	private Point3 p;
	private int r;
	
	Circle2(int r, Point3 p){
		this.r = r;
		this.p =p;
	}
	
	public void showInfo() {
		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);
		System.out.println("r = " + r + "\n");
	}
}

public class HasATest {

	public static void main(String[] args) {
		Point3 p = new Point3(1, 3);
		Circle2 c = new Circle2(10, p);
		c.showInfo();
		
		Circle2 c1 = new Circle2(10, new Point3(1,3));
		c1.showInfo();
	}

}
