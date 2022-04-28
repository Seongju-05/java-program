package Dining_Class;

import java.util.concurrent.Semaphore;

public class DiningPhilosopherMain {

	static final int num = 5;
	public static void main(String[] args) {
		int i;

		Semaphore[] stick = new Semaphore[num];
		
		for (i=0; i<num; i++)
			stick[i] = new Semaphore(1);


		Thread_DiningPhilosopher[] phil = new Thread_DiningPhilosopher[num];
		
		for (i=0; i<num; i++) {
			
				phil[i] = new Thread_DiningPhilosopher(i, stick[i], stick[(i+1)%num]);
		}


		for (i=0; i<num; i++)
			phil[i].start();
	}
	
}
