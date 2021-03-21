package _9LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
		public static void main(String[] args) {
			LinkedHashSet<String> h = new LinkedHashSet<String>();
			h.add("Prateek");
			h.add("Haryani");
			h.add(null);
			h.add("Lakshya");
			h.add("Saluja");
			h.add("Hexaview");
			System.out.print(h.add("Prateek"));
			System.out.print(h);
	// Output :
//False[Prateek, Haryani, null, Lakshya, Saluja, Hexaview]
		}
	}
