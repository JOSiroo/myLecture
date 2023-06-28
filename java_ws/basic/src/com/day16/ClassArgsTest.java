package com.day16;

public class ClassArgsTest {
	public static double mul(int a, double b) {
		return a*b;
	}
	
	// 1. 매개변수가 클래스인 경우
	public static void func1(Circle c) {
		//참조변수가 보이면 참조변수. /★★★★★★★/
		c.draw();
		c.delete();
		c.sayCircle();
	}
	
	
	// 2. 매개변수의 다형성
	public static void func2(Shape sh) {
		sh.draw();
		sh.delete();
	}
	// 3. 반환타입이 클래스인 경우
	public static Circle func3() {	//반환타입이 Circle(클래스)이면 Circle객체가 리턴된다
		Circle c = new Circle();
		return c;
	}
	
	// 4. 반환타입에 다형성 이용
	//반환타입이 Shape(부모)면 자식객체가 리턴된다
	public static Shape func4(int type) {
		Shape sh = null;
		if(type == 1) {
			sh = new Circle();
		}else if(type == 2) {
			sh = new Triangle();
		}
		return sh;
	}
	public static void main(String[] args) {
		/*
			메서드의 매개변수가 int면 main에서 int값을 넣는다
							String이면 String값을 넣는다
							Circle이면 Circle을 넣는다
								어떻게 넣냐? new로 객체를 생성해서 넣는다
							Shape면(부모이면) 자식객체를 넣는다
		*/
		
		// 1) 매개변수가 클래스인 경우
		func1(new Circle());
		// 2) 매개변수의 다형성
		func2(new Triangle());
		
		//또는
		Circle c = new Circle();
		func2(c);
		// 3) 반환타입이 클래스
		Circle c2 = func3();
		c2.draw();
		
		// 4) 반환타입에 다형성이 이용된 경우
		int t = 2;
		Shape sh = func4(t);
		sh.delete();
	}
	
}


