package _10TreeSet;

import java.util.TreeSet;

public class TreeSerDemo {
	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>();
		//t.add(null); only for empty list and after this we cannot include item
		t.add("prateek");
		t.add("Prateek");
		t.add("Haryani");
		t.add("Lakshya");
		t.add("Saluja");
		t.add(null);
		System.out.println(t);
	//	[Haryani, Lakshya, Prateek, Saluja, null, prateek]

	}
}
