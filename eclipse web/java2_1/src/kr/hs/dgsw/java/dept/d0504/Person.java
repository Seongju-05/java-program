package kr.hs.dgsw.java.dept.d0504;

public class Person implements Printer {

	protected String name;
	
	public void sayHello() {
		System.out.println(name + "님 안녕하세요.");
	}

	
	@Override
	public void print() {
		System.out.println("나의 이름은 " + name + "님 안녕하세요.");
	}
	
	@Override
	public void print(String value) {
		this.print();
		System.out.println("나의 친구의 이름은 " + value + "입니다.");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "홍길동";
		person.sayHello();
		person.print();
		person.print("나이스");
		
		Printer person1 = new Person();
		person1.print();
		person1.print("이지은");
	}
}
