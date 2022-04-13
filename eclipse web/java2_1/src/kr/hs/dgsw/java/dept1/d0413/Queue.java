package kr.hs.dgsw.java.dept1.d0413;

public class Queue {

	public static final int SIZE = 20;
	
	private int index;

	private String[] buffer;
	
	public Queue() {
		this.buffer = new String[SIZE];
		this.index = 0;
	}
	
	public void add(String value) {
		if(this.index >= SIZE) {
			throw new RuntimeException("Full");
		}
		
		this.buffer[this.index] = value;
		this.index++;
	}
	
	public String poll() {
		if(this.index == 0) {
			throw new RuntimeException("empty");
		}
		this.index--;
		return this.buffer[this.index];
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("Dog");
		queue.add("Lion");
		queue.add("Shark");
		queue.add("Butterfly");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
	
}
