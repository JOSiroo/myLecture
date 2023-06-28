package HomeWork_NumBaseball.copy.copy;

public class Hitter {
	public int[] hitNum  = new int[3];

	public int[] getHitNum() {
		return hitNum;
	}

	public void setHitNum(int[] hitNum) {
		this.hitNum = hitNum;
	}

	Hitter(int[] hitNum) {
		this.hitNum = hitNum;
	}
}
