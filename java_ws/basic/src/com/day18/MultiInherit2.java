package com.day18;

interface TV2{
	public void onTV();
}
interface Computer2{
	void dataReceive();
}

//상속과 구현을 동시에 할 수 있다.
class IPTV2 implements TV2, Computer{
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	public void onTV() {
		System.out.println("TV영상 출력 중");
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class MultiInherit2 {

	public static void main(String[] args) {
		IPTV obj = new IPTV();
		obj.powerOn();
	}

}
