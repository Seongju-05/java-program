package assignment;

public class OperationEx4 {

	public static void main(String[] args) {

		/*
		 *  ������                   ���                                        ���� ��
		 *  
		 *  +=           �� ���� ���� ���ؼ� ���� �׿� �����Ѵ�.                     num1 += 2;
		 *                                                                   num1 = num1 + 2;�� ����
		 *  
		 *  -=           ���� �׿��� ������ ���� ���� �� ���� ���� �׿� �����Ѵ�.       num1 -= 2;
		 *                                                                   num1 = num1 - 2;�� ����
		 *  
		 *  *=           �� ���� ���� ���ؼ� ���� �׿� �����Ѵ�.                     num1 *= 2;
		 *                                                                   num1 = num1 * 2;�� ����
		 *  
		 *  /=           ���� ���� ������ ������ ������ �� ���� ���� �׿� �����Ѵ�.      num1 /= 2;
		 *                                                                   num1 = num1 / 2;�� ����
		 *                       
		 *  %=           ���� ���� ������ ������ ������ �� �������� ���� �׿� �����Ѵ�.   num1 %= 2;
		 *                                                                   num1 = num1 % 2;�� ����
		 */
		
		// ���� ���� ������
		int num1 = 10;
		
		System.out.println(num1 += 1);
		
		System.out.println(num1 %= 10);
		
		num1 -= 1; // num1 = num1 - 1;
		System.out.println(num1);
		
		
		/*
		 *         ������                                ���                                    ���� ��
		 *  
		 *  ���ǽ� ? ���1 : ��� 2    ���ǽ��� ���̸� ���1, ���ǽ��� �����̸� ���2�� ���õȴ�.  int num = (5 > 3) ? 10 : 20;
		  
		   
		    //���� ������
			int num = (5 > 3) ? 10:30;
			System.out.println(num);
		
		
			int num2 = (5 < 3) ? 'T':'F';
			System.out.println(num2);
		 */
		

	}

}
