package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book ("�¹���1", "������");
		bookArray1[1] = new Book ("�¹���", "������");
		bookArray1[2] = new Book ("�¹��", "���巡");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray1.length; i++)
		{
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("��������");
		
		/*
		for (int i = 0; i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("========");
		
		for (int i = 0; i < bookArray2.length; i++)
		{
			bookArray2[i].showBookInfo();
		}
		*/
		
		// �迭 ����� ó������ ������ ��� ��Ҹ� ���� �Ҷ� ���� �ݺ���
		String[] strArr = {"Java", "Android", "C"};
		
		for (String s : strArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for (int num : arr) { 
			System.out.println(num);
		}
	}

}
