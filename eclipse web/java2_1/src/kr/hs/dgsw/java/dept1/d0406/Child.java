package kr.hs.dgsw.java.dept1.d0406;

public class Child extends AccessModifier {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.protectedValue = 8;
		//child.privateValue = 5;
		child.protectedValue = 7;
		child.defaulValue = 6;
	}
}
