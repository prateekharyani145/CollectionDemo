package _7ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Prateek");
		l.add("Haryani");
		l.add("Chirayu");
		l.add("Agrawal");
		System.out.print(l);
		// Output [Prateek, Haryani, Chirayu, Agrawal]
		ListIterator<String> ltr = l.listIterator();
		while(ltr.hasNext()) {
			String s = (String)ltr.next();
			if(s.equals("Haryani"))
				ltr.remove();
			else if(s.equals("Chirayu")) {
				ltr.add("Pulkit");
			}
			else if(s.equals("Agrawal")) {
				ltr.set("Garg");
			}
		}
		System.out.println(l);
		// Output 	[Prateek, Chirayu, Pulkit, Garg]
		System.out.println(ltr.getClass().getName());
		// Output java.util.LinkedList$ListItr
		// ListItr = which implements ListIterator interface
	}
}
