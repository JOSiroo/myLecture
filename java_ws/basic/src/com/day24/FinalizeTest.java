package com.day24;

class MyTest{
	private String objName;

	MyTest(String objName){
		this.objName = objName;
	}

	//오버라이딩
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println(objName + "이 소멸됨");
	}
}


public class FinalizeTest {

	public static void main(String[] args) {
		/*
		 	finalize() - 인스턴스가 소멸되기 직전에 자바 가상머신에 의해서 자동으로 호출되는 메서드
		*/
		MyTest obj1 = new MyTest("인스턴스1");
		MyTest obj2 = new MyTest("인스턴스2");

		//obj1 = null;	//해당 인스턴스는 가비지 컬렉션의 대상이 됨
		//obj2 = null;
		
		obj1 = obj2;	//	인스턴스1
		obj2 = null;	//	가비지가 생기지 않는다 
		obj1 = null;	//	둘다 가비지
		
		System.out.println("프로그램을 종료합니다");

		System.gc();					//메서드의 완벽한 호출이 필요한 상황에서는 
		System.runFinalization();		//이 두개의 메서드의 연이은 호출이 필요함
	}

}
