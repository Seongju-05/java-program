package Tread_Test2;

public class Thread1 implements Runnable{ 

	public void run() {
		try {
			for(int i =0; i<100; i++) {
				System.out.println("T1 Thread: " + i);
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			System.out.println("Thread 강제 종료");
			return;
		}
	}
}
