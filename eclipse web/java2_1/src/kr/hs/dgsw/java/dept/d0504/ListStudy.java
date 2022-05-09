package kr.hs.dgsw.java.dept.d0504;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListStudy {

	public void study() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> stack = new Stack<String>();
		
		
		list1.add("pizza");
		list2.add("pizza");
		stack.add("pizza");
		
		list1.add("chicken");
		list2.add("chicken");
		stack.add("chicken");
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		System.out.println(stack.get(0));
		Stack<String> stack1 = (Stack<String>)stack;
		System.out.println(stack1.get(0));
		stack1.push("iceCream");
		//stack.push("Cookie");
	}
	
	public static void main(String[] args) {
		ListStudy study= new ListStudy();
		study.study();
	}
	
}
