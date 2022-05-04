package kr.hs.dgsw.java.dept.d0420;

public class Child extends Parent {

	protected int age;
	
	public static void main (String[] args) {
		Child child = new Child();
		child.name = "홍길동";
		child.age = 18;
		//child.weight = 50;
		child.sayHello();
		
		Parent parent = new Parent();
		parent.name = "이경태";
		//parent.age = 180;
		parent.sayHello();
	}
	
}
