package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("�¹��Ѹ�1", "������");
		library[1] = new Book("�¹���", "������");
		library[2] = new Book("�¹��Ѹ�", "���巡");
		library[3] = new Book("�¹�", "������");
		library[4] = new Book("�¹���", "���߷�");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
	}

}
