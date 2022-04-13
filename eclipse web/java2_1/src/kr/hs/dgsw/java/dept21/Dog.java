package kr.hs.dgsw.java.dept21;

public class Dog {

	String color;
	
	double weight;
	
	String name;
	
	public void makesound() {
		System.out.println("멍멍!\n");
	}
	
	public void eat(String food) {
		// System.out.println(name + "이(가) " + food + "을 먹는다.");
		System.out.printf("%s이(가) %s을(를) 먹는다.", name, food);
	}
	
	public void printInformation() {
		//System.out.println("이름: " + name + " 몸무게: " + weight + " 색깔: " + color);
		System.out.println();
		System.out.printf("이름: %s 몸무게: %f 색깔: %s\n\n", name , weight, color);
	}
	
}
