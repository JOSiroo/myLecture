package com.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest2 extends Frame{
	private Button btClose;
	public EventTest2() {
		btClose = new Button("fuck you");
		this.add(btClose, "East");
		//이벤트 연결
		btClose.addActionListener(new ActionListener() {
									//부모객체가 들어가고() {오버라이드메소드}	=> 익명클래스 / 한번 하고 끝날때
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명 클래스 이용!");
				System.exit(0);
			}
		});
	}//생성자

	public static void main(String[] args) {
		EventTest2 f = new EventTest2();
		f.setSize(500, 500);
		f.setVisible(true);
		
	}

}
