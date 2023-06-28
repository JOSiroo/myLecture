package eeee;
/*
import java.util.Scanner;

class Score{
	private String name;
	private String className;
	private int java;
	private int oracle;
	private int jsp;

	public Score(String name, String className, int java, int oracle, int jsp) {
		this.name = name;
		this.className = className;
		this.java = java;
		this.jsp = jsp;
		this.oracle = oracle;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public double sum() {
		return java+oracle+jsp;

	}

	public double avg() {
		return sum()/3;
	}
}


class Manager{
	
	
	
}


public class ScoreTest_조상혁 {
	Scanner sc = new Scanner(System.in);

	public int[] input() {
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void menu() {
		System.out.println("1. 성적입력\n2. 전체학생의 성적 조회\n"
				+ "3. 학생별 성적 조회\n4. 클래스<반>별 성적 조회\n5. 학생 성적 수정\n6. 종료");
	}
	public static String grade(double d) {
		String result = "";
		if(d > 90) {
			result = "A";
		}else if(d > 80) {
			result = "B";
		}else if(d > 70) {
			result = "C";
		}else {
			result = "D";
		}
		return result;

	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int index = 0;
		Score[] s = new Score[100];
		while(true) {
			menu();
			int menu = sc.nextInt();
			sc.nextLine();
			if(menu == 6) {
				System.out.println("종료합니다");
				return;
			}
			if(menu == 1) {
				System.out.println("학생이름, 반, java, oracle, jsp 점수를 입력하세요");
				String name = sc.nextLine();
				String className = sc.nextLine();
				int java = sc.nextInt();
				int oracle = sc.nextInt();
				int jsp = sc.nextInt();
				s[index] = new Score(name, className, java, oracle, jsp);
				s[index].sum();
				s[index].avg();
				grade(s[index].avg());
				index++;
			}else if(menu == 2) {
				System.out.println("==================전체 학생 조회====================");
				System.out.println("학생이름" + "\t" + "클래스" + "\t" + "java" + "\t" + "oracle" + "\t" + "jsp" + "\t" + "총점" + "\t" + "평균" + "\t" + "학점");
				for(int i = 0; i < index; i++) {
				System.out.println(s[i].getName() +"\t"+ s[i].getClassName() +"\t"+ s[i].getJava() +"\t"+ s[i].getOracle() +"\t"+ s[i].getJsp() +"\t"+ s[i].sum() +"\t"+ s[i].avg());
				}
				System.out.println("=================================================");
			}else if(menu == 3) {
				System.out.println("학생 성적 조회");
				String name = sc.nextLine();
				for(int i = 0; i < index; i++) {
					if(name.equals(s[i].getName())) {
						System.out.println("학생이름" + "\t" + "클래스" + "\t" + "java" + "\t" + "oracle" + "\t" + "jsp" + "\t" + "총점" + "\t" + "평균" + "\t" + "학점");
						System.out.println(s[i].getName() +"\t"+ s[i].getClassName() +"\t"+ s[i].getJava() +"\t"+ s[i].getOracle() +"\t"+ s[i].getJsp() +"\t"+ s[i].sum() +"\t"+ s[i].avg());
					}
				}
			}else if(menu == 4) {
				System.out.println("반별 성적 조회");
				String className = sc.nextLine();
				System.out.println("학생이름" + "\t" + "클래스" + "\t" + "java" + "\t" + "oracle" + "\t" + "jsp" + "\t" + "총점" + "\t" + "평균" + "\t" + "학점");
				for(int i = 0; i < index; i++) {
					if(className.equals(s[i].getClassName())) {
						System.out.println(s[i].getName() +"\t"+ s[i].getClassName() +"\t"+ s[i].getJava() +"\t"+ s[i].getOracle() +"\t"+ s[i].getJsp() +"\t"+ s[i].sum() +"\t"+ s[i].avg());
					}
				}
			}else if(menu == 5) {
				System.out.println("학생 성적 수정");
				String Name = sc.nextLine();
				for(int i = 0; i < index; i++) {
					if(Name.equals(s[i].getName())) {
						System.out.println("수정할 점수를 입력하세요 1. java, 2. oracle, 3. jsp");
						int nJava = sc.nextInt();
						int nOracle = sc.nextInt();
						int nJsp = sc.nextInt();
						s[i].setJava(nJava);
						s[i].setOracle(nOracle);
						s[i].setJsp(nJsp);
						System.out.println("수정완료");
					}
				}
			}else {
				System.out.println("종료합니다");
			}
		sc.nextLine();
		}
	}

}
*/