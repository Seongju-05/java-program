package kr.hs.dgsw.java.dept1.d0406;

public class Operator {

	
	public void studyArithmeticOperator() {
		
		int value;
		value = 3 + 5;
		value = 5 - 2;
		value = 4 * 4;
		value = 3 / 2;
		value = 8 % 3;
		
		value += 5; // value = value + 5;
		value -= 3;
		value *= 4;
		value /= 2;
		value %= 3;
		
		int a = value++;
		value--;
		++value;
		--value;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public void studyCompareOperator() {
		boolean flag;
		
		flag = 3 < 2;
		flag = 6 == 6;
		flag = 3 != 4;
		flag = 5 >= 4;
	}
	
	public void studyBitwiseOperator() {
		int value1 = 0x01;  // 0x로 표현하면 16진수로 표현한다.
		int value2 = 0x02;
		int value3 = 0x03;
		
		int value;
		
		value = value1 & value2;
		System.out.printf("%d & %d = %d\n", value1, value2, value);
		
		value = value1 | value2;
		System.out.printf("%d | %d = %d\n", value1, value2, value);
		
		value = value1 ^ value2;
		System.out.printf("%d ^ %d = %d\n", value1, value2, value);
		
		value = ~value1;
		System.out.printf("~%d = %d\n", value1, value);
		
		value1 = 5;
		value = value1 << 1;
		System.out.printf("%d << 1 = %d\n", value1, value);
		
		value1 = -1;
		value = value1 >>> 1;
		System.out.printf("%d >>> 1 = %d\n", value1, value);
		
	}
	
	public static void main (String[] args) {
		Operator operator = new Operator();
		operator.studyBitwiseOperator();
	}
	
}
