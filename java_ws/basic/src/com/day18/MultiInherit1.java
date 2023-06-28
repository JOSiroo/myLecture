package com.day18;

class TV{
	public void onTV() {
		System.out.println("TV영상 출력중");
	}
}

interface Computer{
	void dataReceive();
}

//상속과 구현을 동시에 할 수 있다.
class IPTV extends TV implements Computer{
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class MultiInherit1 {

	public static void main(String[] args) {
		IPTV obj = new IPTV();
		obj.powerOn();
	}

}
