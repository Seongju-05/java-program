package chapter2;

public class CharacterEx {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		System.out.println(ch); // 문자 출력
		System.out.println((int)ch); // 문자에 해당하는 정수 값 (아스키 코드 값) 출력
		
		ch = 66;
		
		System.out.println(ch); // 정수 값에 해당하는 문자 출력
		
		int ch2 = 67;
		System.out.println(ch2); // 문자 정수 값 출력
		System.out.println((char)ch2); // 정수 값에 해당하는 문자 출력
		
		
	}

}
