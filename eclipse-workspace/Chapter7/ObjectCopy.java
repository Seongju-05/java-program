package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book ("태백산맥1", "조정래");
		bookArray1[1] = new Book ("태백산맥", "조점래");
		bookArray1[2] = new Book ("태백산", "조장래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray1.length; i++)
		{
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		
		bookArray1[0].setBookName("나무");
		bookArray1[0].setAuthor("저저정래");
		
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
		
		// 배열 요소의 처음부터 끝까지 모든 요소를 참조 할때 편리한 반복문
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
