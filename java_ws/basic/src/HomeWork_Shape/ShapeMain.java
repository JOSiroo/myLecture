package HomeWork_Shape;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape> list = new ArrayList<>();

		for(;;) {
			System.out.print("1.원 2.사각형 3.보기 4.종료 ==> ");
			int menu = sc.nextInt();
			if(menu == 4) {
				System.out.println("종료합니다.");
				return;
			}
			if(menu == 1) {
				System.out.print("반지름은? ");
				list.add(new Circle(sc.nextInt()));
			}else if(menu == 2) {
				System.out.print("가로는? ");
				int w = sc.nextInt();
				System.out.print("세로는? ");
				int h = sc.nextInt();
				list.add(new Rect(w, h));
			}else if(menu == 3) {
				System.out.println("--------------보기--------------");
				for(int i = 0; i < list.size(); i++) {
					double girth = list.get(i).findGirth();
					System.out.println(list.get(i) + "" + girth);
				}
				System.out.println("--------------보기--------------");
			}

		}

	}

}
