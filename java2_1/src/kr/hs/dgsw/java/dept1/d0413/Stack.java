package kr.hs.dgsw.java.dept1.d0413;

public class Stack {
	
	public static final int SIZE = 10;
	
	private final String[] buffer;
	
	private int index;
	
	public Stack() {
		this.buffer = new String[SIZE];
		this.index = 0;
	}

	public void push(String value) {
		if(this.index >= SIZE) {
			throw new RuntimeException("FULL");
		}
		
		this.buffer[this.index] = value;
		this.index++;
	}
	
	public String pop() {
		
		if(this.index == 0) {
			throw new RuntimeException("Empty");
		}
		this.index--;
		return this.buffer[this.index];
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("Dog");
		stack.push("Lion");
		stack.push("Shark");
		stack.push("Bird");
		
		System.out.println(stack.pop()); // Bird
		System.out.println(stack.pop()); // Shark
		System.out.println(stack.pop()); // Lion
		System.out.println(stack.pop()); // Dog
	}
			
}
