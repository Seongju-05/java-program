package kr.hs.dgsw.java.dept.d0420;

public class Triangle extends Rectangle {
	
	public Triangle(int width,int height) {

	super(width,height);
	}
	
	@Override
	public String getType() {
		return "삼각형";
	}

	@Override
	public double getArea() {
		return this.width * this.width / 2;
	}

	public void main(String[] args) {
		Polygon rectangle = new Rectangle(5,4);
		rectangle.print();
	}
	
	
	
}
