package com.day17;

abstract class Unit{
	protected int x, y; // 현재위치
	/**이동하는 메서드를 구현한다*/
	abstract public void move(int x, int y);
	
	public void stop() {
		System.out.println("현재 위치에 정지합니다.");
	}
	
}

class Marine extends Unit{
	//지정된 위치로 이동
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("보병이 " + x + ", " + y + "위치로 이동한다");
	}
	public void stimPack() {
		System.out.println("스팀팩을 사용한다");
	}
}
class Tank extends Unit{
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("탱크가 " + x + ", " + y + "위치로 이동한다");
	}
	public void changeMode() {
		System.out.println("시즈모드로 변환한다");
	}
}

class Dropship extends Unit{
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("수송선의 위치를 " + x + ", " + y + "위치로 이동한다");
	}
	public void load() {
		System.out.println("선택된 대상을 태운다");
	}
	public void unload() {
		System.out.println("선택된 대상을 내린다");
	}
}
public class Starcraft {

	public static void main(String[] args) {
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine();
		uArr[1] = new Tank();
		uArr[2] = new Dropship();
		uArr[3] = new Marine();
	
		for(int i = 0; i < uArr.length; i++) {
			//Unit 배열의 모든 유닛을 10, 30의 위치로 이동한다
			uArr[i].move(10, 30);
		}//for
		
		//down-casting 이용 - 자식만의 메서드 호출
		Unit u = new Marine();
		if(u instanceof Marine) {
			Marine m = (Marine)u;
			m.stimPack();
		}
		
		System.out.println("================배열 : down-casting==============");
		for(int i = 0; i < uArr.length; i++) {
			if(uArr[i] instanceof Marine) {
				Marine m = (Marine)uArr[i];
				m.stimPack();
			}else if(uArr[i] instanceof Tank) {
				Tank t = (Tank)uArr[i];
				t.changeMode();
			}else if(uArr[i] instanceof Dropship) {
				Dropship d = (Dropship)uArr[i];
				d.load();
				d.unload();
			}
		}
		System.out.println("\n=========확장 for==========");
		for(Unit unit : uArr) {
			if(unit instanceof Marine) {
				Marine m = (Marine)unit;
				m.stimPack();
			}else if(unit instanceof Tank) {
				Tank t = (Tank)unit;
				t.changeMode();
			}else if(unit instanceof Dropship) {
				Dropship d = (Dropship)unit;
				d.load();
				d.unload();
			}
		}//for
	}

}
