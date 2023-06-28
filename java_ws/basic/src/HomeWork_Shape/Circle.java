package HomeWork_Shape;

class Circle extends Shape{
	private double r;
	private final double PI = 3.14;
	
	Circle(double r){
		this.r = r;
	}

	public double findGirth() {
		return 2*r*PI;
	}
	public String toString() {
		return "[Circle, r = " + r + "]\n원의 둘레 : ";
	}
	
}
