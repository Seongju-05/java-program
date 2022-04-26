package Tread_Test2;

public class ThreadMain {

	public static void main(String[] args) {
		//Thread1 m1 = new Thread1();
		Thread1 m1 = new Thread1();
		
		Thread t1 = new Thread(m1,"t1");
		Thread t2 = new Thread(m1,"t2");
		Thread t3 = new Thread(m1,"t3");
		Thread t4 = new Thread(m1,"t4");
		Thread t5 = new Thread(m1,"t5");
		Thread t6 = new Thread(m1,"t6");
		Thread t7 = new Thread(m1,"t7");
		Thread t8 = new Thread(m1,"t8");
		Thread t9 = new Thread(m1,"t9");
		Thread t10 = new Thread(m1,"t10");
		
//		Thread Interrupt : Thread  강제 종료
//		Thread setPriority : Thread 우선 순위 설정
//		Thread getName : Thread 이름 설정
		
//		t1.setPriority(Thread.MAX_PRIORITY); <- 우선처리
//		t1.setPriority(Thread.MIN_PRIORITY); <- 제일 늦게
//		t1.setPriority(Thread.NORM_PRIORITY); <- 기본값
		
//		t10.setPriority(Thread.MAX_PRIORITY);
//		t1.setPriority(Thread.MIN_PRIORITY);

		
//		t1.setPriority(10);  <- 우선처리
//		t1.setPriority(1); <- 제일 늦게
//		t1.setPriority(5); <- 기본값
		
//		t10.setPriority(10);
//		t1.setPriority(1);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();

		for (int i = 0; i < 100; i++) {
			System.out.printf("Main Thread: %d\n",i);
		}

	}

}
