package com.day15;


// 2차원 좌표계의 한 점을 표시
class Point{
	protected int x;
	protected int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String findLocation(){
		String result = "x = "+ x + ", y="+y;
		return result;
	}
}
// 3차원 좌표계의 한 점을 표현
class Point3D extends Point{
	private int z;
	
	Point3D(int z, int x, int y){
		//생성자 첫줄에서 다른 생성자를 호출하지 않으면 컴파일러가 super()를 넣어줌
		super(x, y);
		this.z = z;
	}
	
	/*
	 	★★★★★★자식 생성자 만들때 해야할 일★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		★- 부모 생성자가 매개변수를 가지고 있다면 자식은 부모의 생성자에게 매개변수를 넣어줘야 함★
	*///★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
	//오버라이딩
	public String findLocation() {
		//String result = "x = "+ x +", y = " + y +", z="+z;
		//super.부모메서드(), 오버라이딩 메서드에서 자주 사용함
		String result = super.findLocation() + ", z = " + z;
		return result;
	}
}
public class OverridingTest1 {

	public static void main(String[] args) {
		Point3D p = new Point3D(10,20,30);
		System.out.println("3차원 좌표 : " + p.findLocation());
	
		Point p2 = new Point(15,35);
		System.out.println("2차원 좌표 : " + p2.findLocation());
		
	
	}

}
