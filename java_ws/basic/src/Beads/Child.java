package Beads;

public class Child {
	private int numOfBead; // 구슬의 개수

	Child(int numOfBead) {
		this.numOfBead = numOfBead;
	}

	public int getNumOfBead() {
		return numOfBead;
	}

	public void setNumOfBead(int numOfBead) {
		this.numOfBead = numOfBead;
	}

	public int loseBead(int loseBead) {
		if(numOfBead < loseBead) {
			loseBead = numOfBead;
		}
		numOfBead -= loseBead;	
		return numOfBead;
	}
	
	public void obtainBead(Child child, int obtainBead) {
		child.loseBead(obtainBead);
		numOfBead += obtainBead;	
	}
	
	public void showProperty() {
		System.out.println("보유 구슬의 개수: " + numOfBead);
	}
}


