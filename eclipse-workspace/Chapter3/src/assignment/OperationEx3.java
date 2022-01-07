package assignment;

public class OperationEx3 {

	public static void main(String[] args) {

		// 논리 연산자
		// 관계 연산자와 혼합하여 많이 사용됨
		// 연산의 결과가 true(참),false(거짓)으로 반환 됨
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10) );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ( ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10) );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
