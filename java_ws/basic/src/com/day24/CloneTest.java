package com.day24;

class Point implements Cloneable{
	private int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y; 
	}
	
	public Point copy() throws CloneNotSupportedException {
		Object obj = clone();
		Point p = (Point)obj;
		
		return p;
	}
}

public class CloneTest {

	public static void main(String[] args) {
		/*
			clone() - 자신을 복제하여 새로운 인스턴스를 생성하는 일을 함
					- 단순히 멤버변수의 값만을 복사함
					- Cloneable 인터페이스를 구현한 클래스의 인스턴스만 clone()을 통한 복제가 가능함
		*/
		Point original = new Point(10, 20);
		try {
			Point p = original.copy();
			
			System.out.println("original = " + original);
			System.out.println("copy본 : " + p);
			
			System.out.println("original 주소 : " + original.hashCode());
			System.out.println("p 주소 : " + p.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}

}
