package com.day19.ETC;

//카드 한벌 - 52장의 카드를 갖는 크랠스
public class Deck {
	private static final int CARD_NUM = 52;	//카드의 개수
	private Card[] cardList = new Card[CARD_NUM];
	private int index;
	
	public Deck() {
		//카드 52장 초기화
		for(int i = 1; i <= Card.MAX_KIND; i++) {	//4
			for(int j = 1; j <= Card.MAX_NUMBER; j++) {	//13
				Card c = new Card(i, j);
				cardList[index++] = c;
			}//안쪽
		}//바깥
	}
	
	public Card[] getCardList() {
		return cardList;
	}
	
	//카드 뽑는 메서드 - 지정된 위치에 있는 카드 하나를 선택
	public Card pick(int idx) {
		Card c = null;
		if(idx < 0 || idx >= CARD_NUM) {
			c = pick();
		}else {
			c = cardList[idx];
		}
		return c;
	}

	//임의의 카드 한장 뽑기
	public Card pick() {
		//0~51사이의 idx에 해당하는 랜덤값 뽑기
		int rnd = (int)(Math.random()*52);	//0~51
		Card c = cardList[rnd];
		return c;
	}
	
	//카드의 순서를 섞는다
	public void shuffle() {
		/*
			카드 한 벌의 첫번째 장과 임의로 선택한 위치에 있는
			카드의 위치를 서로 바꾸는 방식으로 카드를 섞는다
		*/
		for(int i = 0; i < 1000; i++) {
			int rnd = (int)(Math.random()*52);
		
		//0번째 배열의 값과 서로 맞바꾸기 swap
		Card temp = cardList[0];
		cardList[0] = cardList[rnd];
		cardList[rnd] = temp;
		}
	}




}
