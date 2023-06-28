package HomeWork_NumBaseball.copy.copy;

public class Pitcher {
	public int[] pitNum = new int[3];

	public void setPitNum(int[] pitNum) {
		this.pitNum = pitNum;
	}

	public int[] getPitNum() {
		for (int i = 0; i < pitNum.length; i++) {
			this.pitNum[i] = (int)(Math.random() * 10);  // 0부터 9까지 랜덤한 값 생성
			for(int j = 0; j < i; j++) {
				if(this.pitNum[i] == this.pitNum[j]) {
					i--;
				}
			}
		}
		return pitNum;
	}
}
