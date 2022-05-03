package Thread_Test;

public class Thread2 implements Runnable {
		public void run() {
			for (int i = 0; i < 500; i++) {
				System.out.println("t2 Thread: " + i);
			}
		}
}
