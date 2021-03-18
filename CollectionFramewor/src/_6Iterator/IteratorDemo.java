package _6Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			a.add(i);
		}
		System.out.println(a);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			Integer I = (Integer) it.next();
			if(I%2==0)
				System.out.print(I);//02468
			else
				it.remove();
		}
		System.out.println(a);//[0, 2, 4, 6, 8]
		System.out.print(it.getClass().getName());//java.util.ArrayList$Itr
		// $ = inner class
		// Itr = which implements iterator interface
	}

}
