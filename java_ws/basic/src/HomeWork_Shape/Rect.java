package HomeWork_Shape;

class Rect extends Shape{
	private int w;
	private int h;
	
	Rect(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	public double findGirth() {
		return 2*(w*h);
	}
	public String toString() {
		return "[Rect w = " + w + ", h = " + h + "]\n사각형의 둘레 : ";
	}
}
