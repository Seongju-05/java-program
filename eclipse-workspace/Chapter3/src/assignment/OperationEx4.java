package assignment;

public class OperationEx4 {

	public static void main(String[] args) {

		/*
		 *  연산자                   기능                                        연산 예
		 *  
		 *  +=           두 항의 값을 더해서 왼쪽 항에 대입한다.                     num1 += 2;
		 *                                                                   num1 = num1 + 2;와 같음
		 *  
		 *  -=           왼쪽 항에서 오른쪽 항을 빼서 그 값을 왼쪽 항에 대입한다.       num1 -= 2;
		 *                                                                   num1 = num1 - 2;와 같음
		 *  
		 *  *=           두 항의 값을 곱해서 왼쪽 항에 대입한다.                     num1 *= 2;
		 *                                                                   num1 = num1 * 2;와 같음
		 *  
		 *  /=           왼쪽 항을 오른쪽 항으로 나누어 그 몫을 왼쪽 항에 대입한다.      num1 /= 2;
		 *                                                                   num1 = num1 / 2;와 같음
		 *                       
		 *  %=           왼쪽 항을 오른쪽 항으로 나누어 그 나머지를 왼쪽 항에 대입한다.   num1 %= 2;
		 *                                                                   num1 = num1 % 2;와 같음
		 */
		
		// 복합 대입 연산자
		int num1 = 10;
		
		System.out.println(num1 += 1);
		
		System.out.println(num1 %= 10);
		
		num1 -= 1; // num1 = num1 - 1;
		System.out.println(num1);
		
		
		/*
		 *         연산자                                기능                                    연산 예
		 *  
		 *  조건식 ? 결과1 : 결과 2    조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택된다.  int num = (5 > 3) ? 10 : 20;
		  
		   
		    //조건 연산자
			int num = (5 > 3) ? 10:30;
			System.out.println(num);
		
		
			int num2 = (5 < 3) ? 'T':'F';
			System.out.println(num2);
		 */
		

	}

}
