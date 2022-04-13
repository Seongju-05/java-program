package kr.hs.dgsw.java.dept1.d0413;

public class ArrayStudy {

	public void studyArray() {
		
		/* 배열 선언 */
		{
		int[] array1;
		int array2[];
		}
		
		/* 배열의 정의 */
		{
			int[] array1 = new int[5];
			array1[0] = 3;
			array1[1] = 5;
			
			//array1[5] = 20;
		}
		
		/* 배열의 초기값 */
		{
			int[] intArray = new int[1];
			double[] doubleArray = new double[1];
			boolean[] booleanArray = new boolean[1];
			String[] StringArray = new String[1];
			
			System.out.println("intArray : " + intArray[0]);
			System.out.println("doubleArray : " + doubleArray[0]);
			System.out.println("booleanArray : " + booleanArray[0]);
			System.out.println("StringArray : " + StringArray[0]);	
		}
		
		/* 배열의 정의와 초기화 */
		{
			String[] colors = { "red", "green", "blue", "black", "magenta", "yellow"};
			System.out.println("배열의 크기 : " + colors.length);
			
			/* Trace */
			
			for (int i = 0; i < colors.length; i++) {
				System.out.printf("%d - %s\n", i, colors[i]);
			}
			
			for (String color : colors) {
				System.out.println(color);
			}
			
		}
		
		/* 평균값 구하기 */
		{
			int[] ages = {18, 20, 30, 15, 25, 35, 40, 45 ,7, 2, 80, 13};
			double average = 0;
			int sum = 0;
			for (int i = 0; i < ages.length; i++) {
				sum += ages.length;
			}
			average = sum / ages.length;
			
			System.out.printf("평균나이 : %2f\n",average);
		}
		
		{
			int value1 = 5;
			int value2 = value1;
			value2 = 10;
			
			System.out.println("int : " + value1 + " " + value2);
			
			int[] array1 = {1,2,3};
			int[] array2 = array1;
			int[] array3 = copy(array1);
			array2[1] = 100;
			
			System.out.println("array : " + array1[1] + " " + array2[1] + " " + array3[1]);
			
		}
		
	}
		
		public int[] copy(int[] src) {
			int[] result = new int[src.length];
		
			for(int i = 0; i < src.length; i++) {
				result[i] = src[i];
			}
			return result;
		}
	
		public static void main(String[] args) {
			ArrayStudy study = new ArrayStudy();
			study.studyArray();
	}

}
