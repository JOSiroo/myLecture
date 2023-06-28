package com.day19.ETC;

public class Card {
	private final int KIND;	//카드 무늬의 수 1~4
	private final int NUMBER;	//무늬별 카드 수 1~10 J,Q,K
	
	private static final int SPADE = 1;
	private static final int DIAMOND = 2;
	private static final int HEART = 3;
	private static final int CLOVER = 4;
	
	public static final int MAX_KIND = 4;
	public static final int MAX_NUMBER = 13; 
	
	public Card() {
		this(SPADE, 1);
	}
	
	public Card(int kind, int num) {
		this.KIND = kind;
		this.NUMBER = num;
	}
	
	public String findInfo() {
		String kind = "", number = "";
		
		switch(KIND) {
		case SPADE : 
			kind = "SPADE";
			break;
		case DIAMOND : 
			kind = "DIAMOND";
			break;
		case HEART : 
			kind = "HEART";
			break;
		case CLOVER : 
			kind = "CLOVER";
			break;
		}
		switch(NUMBER) {
		case 11 :
			number = "J";
			break;
		case 12 :
			number = "Q";
			break;
		case 13 :
			number = "K";
			break;
		default:
			number = NUMBER + "";
		}
	return "card[kind = " + kind + ", number = " + number + "]";	//SPADE, k
	}
}
