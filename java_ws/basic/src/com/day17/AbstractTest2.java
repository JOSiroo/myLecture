package com.day17;

abstract class Player{
	protected boolean pause;	//일시정지 상태를 저장하기 위한 변수
	protected int currentPos;	//현재 play되고 있는 위치를 저장하기 위한 변수
	
	Player(){	// 추상클래스도 생성자가 있어야 한다
		pause = false;
		currentPos = 0;
	}
	
	/** 지정된 위치 (pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다*/
	 abstract public void play(int pos);

	 abstract public void stop();
	 
	 public void play() {
		 play(currentPos);	//추상 메서드를 사용 할 수 있다
	 }
	 
	 public void pause() {
		 if(pause) {
			 pause = false;
			 play(currentPos);
		 }else {
			 pause = true;
			 stop();
		 }
	 }
}
class CDPlayer extends Player{
	/*부모클래스의 추상메서드를 CDPlayer 클래스의 기능에 맞게 완성해주고,
	 CDPlayer 만의 새로운 기능을 추가한다*/
	//부모 클래스의 추상 메서드를 구현한다
	public void play(int currentPos) {
		System.out.println("지정된 위치" + currentPos + "에서 재생을 시작한다");
	}
	public void stop() {
		System.out.println("재생을 즉시 멈춘다. ");
	}
	
	//CDPlayer 클래스에 추가로 정의된 멤버
	private int currentTrack;	//현재 재생중인 트랙
	private String[] trackList;
	
	
	
	public String[] getTrackList() {
		return trackList;
	}
	public void setTrackList(String[] trackList) {
		this.trackList = trackList;
	}
	public int getCurrentTrack() {
		return currentTrack;
	}
	public void setCurrentTrack(int currentTrack) {
		this.currentTrack = currentTrack;
	}
	
	
	public void nextTrack() {
		currentTrack++;
	}
	public void prevTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}
	}
}
public class AbstractTest2 {

	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.play();
		cd.stop();
		cd.nextTrack();
		cd.prevTrack();
	}

}
