package kr.hs.dgsw.java.dept21.d0323;

public class DataTypeStudy {

	public void studyIntegerType() {
		int intValue = 2000000000;
		byte byteValue = 127;
		short shortValue = 1000;
		long longValue = 3000000000L;
		
		Integer integer = 3;
	}
	
	public void studyRealNumberType() {
		float piFloat = 3.14159261234567890F;
		double piDouble = 3.1415926;
		
		System.out.println(piFloat);
		System.out.println(piDouble);
		
	}
	
	public void studyBoolean() {
		System.out.println((4 > 2));
		boolean flag = true;
		boolean win = false;
		
		if (4 > 2) {
			// do something
		}
	}
	
	public void studyChar() {
		char ch1 = 'A';
		String str = "ABC";
		int ch2 = 65;
		
		System.out.println((int)ch1);
		System.out.println((char)ch2);
		
		char h1 = '가';
		System.out.printf("%d - %c\n", (int)h1,h1);
		System.out.printf("%d - %c\n", (int)h1+1,(char)h1+1);
		System.out.printf("%d - %c\n", (int)h1+2,(char)h1+2);
		
		int countOfHangeul = '힣' - '가' + 1;
		System.out.printf("한글에 부여된 코드의 개수 : " + countOfHangeul);
		
		
				/*
		for (int i = 1; i <= 256; i++) {
			char ch = (char)i;
			
			System.out.printf("%03d %02X - %c\n", i, i, ch);
		}
		*/
	}
	
	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		study.studyChar();
	}
	
}
