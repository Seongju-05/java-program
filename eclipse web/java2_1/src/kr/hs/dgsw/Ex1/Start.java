package kr.hs.dgsw.Ex1;

public class Start {

	public static void main(String[] args) {
		
		People people1 = new People();
		People people2 = new People();
		
		people1.name = "김영희";
		people1.height = 165;
		people1.weight = 55;
		
		people2.name = "김철수";
		people2.height = 170;
		people2.weight = 90;
		
		people1.checkBMI();
		people2.checkBMI();
		
		people1.Infomation();
		people2.Infomation();
		
	}
}


