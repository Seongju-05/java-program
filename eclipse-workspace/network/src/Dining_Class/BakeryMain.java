package Dining_Class;

public class BakeryMain {

	public static void main(String[] args) {

		for (int i = 0; i < Thread_Bakery.numberOfThreads; i++) {
			Thread_Bakery.choosing[i] = false;
			Thread_Bakery.ticket[i] = 0;
		}

		Thread_Bakery[] threads = new Thread_Bakery[Thread_Bakery.numberOfThreads];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread_Bakery(i);
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
