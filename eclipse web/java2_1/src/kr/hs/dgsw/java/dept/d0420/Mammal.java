package kr.hs.dgsw.java.dept.d0420;

public class Mammal extends Animal {

	protected double bodyTemperature;
	
	public double getBodyTemperature() {
		return bodyTemperature;
	}
	
	@Override
		public void birth() {
		
		System.out.println("뱃속에서 새끼를 키워서 놓습니다.");
		
	}
}
