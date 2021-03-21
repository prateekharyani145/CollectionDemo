package _8HashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Prateek");
		h.add("Haryani");
		h.add(null);
		h.add("Lakshya");
		h.add("Saluja");
		h.add("Hexaview");
		System.out.print(h.add("Prateek"));
		System.out.print(h);
// Output :
//false[null, Saluja, Hexaview, Haryani, Lakshya, Prateek]
	}

}
