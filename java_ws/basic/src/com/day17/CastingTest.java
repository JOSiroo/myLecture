package com.day17;

/*
 	참조형 변수도 형변환이 가능
 	단, 서로 상속관계에 있는 클래스 사이에서만 가능
 	
 	1) 자동 형변환(다형성, up-casting)
 		부모타입 <- 자식 타입
 		예) Parent p = new Child();
 		
 	2) 명시적 형변환(down-casting)
 		자식타입 <- 부모 참조변수★★★
 		예 Child c = (Child)p;
*/
class Car{
	public void drive() {
		System.out.println("운전하는 기능 구현");
	}
	public void stop() {
		System.out.println("멈춘다");
	}
}

class FireEngine extends Car{
	public void water() {
		System.out.println("water!!");	
	}
	public void drive() {
		System.out.println("소방차를 운전합니다");
	}
}

class Ambulance extends Car{
	public void siren() {
		System.out.println("siren~~~!!");	
	}
	public void drive() {
		System.out.println("앰뷸런스를 운전합니다");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		Car c = new FireEngine();	//다형성, 자동형변환
		c.drive();	//자식의 오버라이딩 메서드 호출
		//c.water();	//error : 자식만의 메서드 호출 불가
		
		FireEngine f = (FireEngine)c;	// down-casting, 명시적 형변환
		f.water();	//자식만의 메서드 호출 가능해짐!
		
		//FireEngine f2 = (FireEngine)new Car();	//실행에러(컴파일은 되지만 런타임 에러)
		//Car cannot be cast to class FireEngine 

		/*
	 	instanceof
	 	- 참조변수가 참조하고 있는 인스턴스의 실재 타입을 알아보기 위해 사용
	 	
	 	참조변수 instanceof 타입(클래스명)
		=> true이면 검사한 탕입으로 형변환이 가능
		*/
		
		if(c instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c;
			f3.water();
		}else if(c instanceof Ambulance) {
			Ambulance am = (Ambulance)c;
			am.siren();
		}else {
			System.out.println("형변환 불가");
		}
		
		Car c2 = new Car();
		if(c2 instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c;
			f3.water();
		}else {
			System.out.println("c2를 FireEngine으로 형변환 불가");
		}
		/*
		자식 instanceof 부모클래스 : true
		=> 자식은 부모의 인스턴스이기도 하므로 true(자식은 부모의 인스턴스를 포함하고 있다)
		 */
		
		FireEngine f4 = new FireEngine();
		if(f4 instanceof FireEngine) {
			System.out.println("f4는 FireEngine의 인스턴스이다");
		}
		if(f4 instanceof Car) {	//자식 instanceof 부모 => true
			System.out.println("f4는 Car의 인스턴스이다");
		}
		if(f4 instanceof Object) {
			System.out.println("f4는 Object의 인스턴스이다");
		}
	}
	
}












