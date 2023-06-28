package com.day14;

import com.day13.MyParent;

class Child extends MyParent{
	public void childInfo() {
		System.out.println("==========Child =========");
		//System.out.println("private num1="+num1); //error:The field MyParent.num1 is not visible
		//System.out.println("default num2="+num2); //error
		System.out.println("protected num3="+num3); //public처럼 동작함 // 클래스 디자인 시에는 public처럼 동작
		System.out.println("public num4="+num4+"\n");		
	}
}

public class ProtectedTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println("main MyParent num1="+ p.num1); //error:The field MyParent.num1 is not visible
		//System.out.println("main MyParent num2="+ p.num2); //error ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		//System.out.println("main MyParent num3="+ p.num3); //error 실행타임에는 default이기 때문에 다른 패키지에 있는 MyParent클래스에 접근 불가능
		System.out.println("main MyParent num4="+ p.num4); // public
		
		
		Child ch = new Child();
		//System.out.println("main Child num1="+ ch.num1); //error:The field MyParent.num1 is not visible
		//System.out.println("main Child num2="+ ch.num2); //error ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		//System.out.println("main Child num3="+ ch.num3); //실행타임에는 default이기 때문에 다른 패키지에 있는 MyParent클래스에 접근 불가능
		System.out.println("main Child num4="+ ch.num4); // public
		
		ch.childInfo();		// num3 출력 가능 이유 : 클래스에 public 메소드 이용하였기 때문
		ch.showInfo();		// num3 출력 가능 이유 : 클래스에 public 메소드 이용하였기 때문
		
		/*
		 protected
		 - 객체의 메모리를 생성한 후 점(.)찍고 접근할 때는 완벽한 default이면서
		 상속관계의 클래스 디자인타임에는 완벽한 public
		*/
	}

}
