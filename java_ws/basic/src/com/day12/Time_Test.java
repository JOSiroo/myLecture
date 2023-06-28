package com.day12;


class Time{
	private int hour;
	private int min;
	private int sec;
	
	//getter/setter
	public void setHour(int h) {
		if(h < 0 || h > 23) {
			return;
		}
		hour = h;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setMin(int m) {
		if(m < 0 || m > 59) {
			return;
		}
		min = m;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setSec(int s) {
		if(s < 0 || s > 59) {
			return;
		}
		sec = s;
	}
	
	public int getSec() {
		return sec;
	}
	
}

public class Time_Test {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(16);
		t.setMin(31);
		t.setSec(50);
		
		System.out.println(t.getHour() + "시 " + t.getMin() + "분 " + t.getSec() + "초");
		
		t.setHour(24);
		t.setMin(60);
		t.setSec(70);
		System.out.println(t.getHour() + "시 " + t.getMin() + "분 " + t.getSec() + "초");
		
	}

}
