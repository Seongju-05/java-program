package kr.hs.dgsw.java.dept21;

public class DogTester {

	public static void main(String[] args) {
	
		Dog jindo = new Dog();
		Dog siba = new Dog();
		
		jindo.name = "진돗개";
		jindo.weight = 8.5;
		jindo.color = "베이지색";
		
		siba.name = "시바견";
		siba.weight = 4.5;
		siba.color = "누런색";
		
		jindo.makesound();
		jindo.eat("사료");
		jindo.printInformation();
		
		siba.makesound();
		siba.eat("뼈다귀");
		siba.printInformation();
	}
	
}
