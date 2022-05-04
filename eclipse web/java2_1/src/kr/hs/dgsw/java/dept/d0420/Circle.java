package kr.hs.dgsw.java.dept.d0420;

public class Circle extends Polygon{

	protected final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String getType() {
		return "원";
	}
	
	@Override
	public double getArea() {
		return radius * 3.14;
	}
	
	public void main(String[] args) {
		Polygon Circle = new Circle(5);
		Circle.print();
	}
	
}
