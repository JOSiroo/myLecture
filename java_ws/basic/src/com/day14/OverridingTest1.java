package com.day14;

/*
	오버라이딩 (overriding)
		- 자식클래스에서 부모로부터 상속받은 메서드의 내용을 변경하는 것
		- 메서드 재정의
*/

// 2차원 좌표계의 한 점을 표시
class Point{
	protected int x;
	protected int y;
	
	public String findLocation(){
		String result = "x = "+", y="+y;
		return result;
	}
}
// 3차원 좌표계의 한 점을 표현
class Point3D extends Point{
	private int z;
	
	//오버라이딩
	public String findLocation() {
		String result = "x = "+ x +", y = " + y +", z="+z;
		return result;
	}
}
public class OverridingTest1 {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println("3차원 좌표 : " + p.findLocation());
	
		Point3D p2 = new Point3D();
		System.out.println("2차원 좌표 : " + p2.findLocation());
		
	
	}

}
