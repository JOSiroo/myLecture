package com.day24;

class Outer{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}

	public void method() {
		class LocalInner{
			int iv = 400;
		}
	}
	
}


public class InnerTest3 {

	public static void main(String[] args) {
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
	
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv = " + si.iv);
		
		
		//인스턴스클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야한다
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println("ii.iv = " + ii.iv);
	
	}

}
