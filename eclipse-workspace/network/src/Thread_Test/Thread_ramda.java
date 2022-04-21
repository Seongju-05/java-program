package Thread_Test;

public class Thread_ramda {

	public static void main(String[] args) {
		//Thread1 m1 = new Thread1();
		Thread2 m2 = new Thread2();
	
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(m2);
		
		// Override 방식으로 쓰레드 생성
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i =0; i <500; i++) {
					System.out.printf("t3 Thread : %d \n",i);
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		//Lambda로 쓰래드 생성
		
		new Thread ( () -> {
			for (int i = 0; i < 500;i++) {
				System.out.printf("t4 Thread : %d \n",i);
			}
		}).start();
		
		for (int i = 0; i < 500; i++) {
			System.out.println("main Thread: " + i);
		}
		try {
			
		t1.join();
		t2.join();
		t3.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("모두 종료");
	}
	
}
