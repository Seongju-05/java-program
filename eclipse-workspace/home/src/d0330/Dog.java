package d0330;

public class Dog {
	
	private String name;
	
	private int age;
	
	public Dog(String name) {
		this.name = name;
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�.");
	}
	
	public void print() {
		System.out.printf("%s�� ���̰� %d�� �Դϴ�.\n", this.name, this.age);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Dog happy = new Dog("����");
		happy.print();
		happy.getName();
		
		Dog puppy = new Dog("����");
		
		final int value = 3;
	}
}
