package _4Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> s = new Stack<Object>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s.search("C"));//1
		s.pop();
		System.out.println(s);//[A,B]
		System.out.println(s.search("A"));//2
		System.out.println(s.search("C"));//-1
		System.out.println(s.search("Z"));//-1
		
		
	}
}
