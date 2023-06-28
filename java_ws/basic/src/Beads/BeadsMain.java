package Beads;

public class BeadsMain {

	public static void main(String[] args) {
		Child ch1 = new Child(15);
		Child ch2 = new Child(9);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.println("===어린이1===");
		ch1.showProperty();
		System.out.println("===어린이2===");
		ch2.showProperty();

		ch1.obtainBead(ch2, 2);
		ch2.obtainBead(ch1, 7);

		System.out.println("\n게임 후 구슬의 보유 개수");

		System.out.println("===어린이1===");
		ch1.showProperty();
		System.out.println("===어린이2===");
		ch2.showProperty();
	}
}


