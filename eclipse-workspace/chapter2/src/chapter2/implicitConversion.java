package chapter2;

public class implicitConversion {

	public static void main(String[] args) {

		byte bnum = 10;
		int num = bnum; 
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		
		System.out.println(dNum);
	}

}
