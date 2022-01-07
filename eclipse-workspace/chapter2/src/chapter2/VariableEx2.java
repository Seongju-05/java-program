package chapter2;

public class VariableEx2 {

	public static void main(String[] args) {
		
		int num = 1;
		long level = 12345678900L;
		
		/*
		 * int num = 12345678900; // 오류 남 int의 범위 넘은 값 대입
		 * 
		 * long num = 12345678900; // 오류남 숫자(리터럴) 12345678900은 기본형이 int 의 범위 넘는 수
		 * 
		 * => 숫자(리터럴) 12345678900을 long으로 처리하도록 명시
		 * long num = 12345678900L; // ok 소문자를 l로 써도 되지만 1과 구별하기 위해 대문자로 씀
		 */
	}

}
