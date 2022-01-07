package assignment;

public class OperationEx2 {

	public static void main(String[] args) {

		// 증가 감소 연산자
		// 단한 연산자 1만큼 더하거나 1만큼 뺄때 사용하는 연산자 항의 앞/뒤 위치에 따라 연산의 결과가 달아짐에 유의
		
		int num = 10;
		System.out.println(++num); // 먼저 num값이 1 증가한 후 num 변수에 대입
		System.out.println(num++); // 기존 num값을 먼저 대입한 후 num 값 1 중가
		System.out.println(--num); // 먼저 num값이 1 감소한 후 num 변수에 대입
		System.out.println(num--); // 기존 num값을 먼저 대입한 후 num 값 1 감소
		
		System.out.println(num);
		
		//관계연산자
		// 연산의 결과가 ture(참), false(거짓)으로 반환 됨
		
		System.out.println(3< 5);
		
		int num1 = 10;
		int num2 = 5;
		boolean flag = (num1 > num2);
		System.out.println(flag);
		
		
	}

}
