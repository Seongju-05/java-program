package Thread_Test;

public class ThreadMain {
	
	public static void main(String[] args) {
		//Thread1 m1 = new Thread1();
		Thread2 m2 = new Thread2();
	
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(m2);
		
		
		t1.start();
		t2.start();
	
		for (int i = 0; i < 500; i++) {
			System.out.println("main Thread: " + i);
		}
	
	}
	
}
