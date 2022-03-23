package kr.hs.dgsw.Ex1;

public class People {
	
	String name;
	double height;
	double weight;
	double BMI;
	String State;

	public void checkBMI() {
		BMI = weight / ((height * height) / 10000.0);
		State = BMI > 25.0 ? "과체중" : (BMI < 20 ? "저체중" : "표준체중");
	}
	
	public void Infomation() {
		System.out.printf("%s의 비만도는 %f이고 %s입니다.\n", name, BMI, State);
	}
}
