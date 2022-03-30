package d0330;

public class Dog {
	
	private String name;
	
	private int age;
	
	public Dog(String name) {
		this.name = name;
		System.out.println("생성자가 호출되었습니다.");
	}
	
	public void print() {
		System.out.printf("%s는 나이가 %d살 입니다.\n", this.name, this.age);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Dog happy = new Dog("해피");
		happy.print();
		happy.getName();
		
		Dog puppy = new Dog("퍼피");
		
		final int value = 3;
	}
}
