package Thread_Test;

public class Thread1 extends Thread{ 
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("t1 Thread: " + i);
		}
	}
}
