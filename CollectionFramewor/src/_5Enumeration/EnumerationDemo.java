package _5Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer I = (Integer) e.nextElement();
			if(I%2==0)
				System.out.print(I);//02468
		}
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	
		System.out.print(e.getClass().getName());//java.util.Vector$1
		// $ = inner class
		// 1,2,3 these type represent anonymous class
	
	}
}
