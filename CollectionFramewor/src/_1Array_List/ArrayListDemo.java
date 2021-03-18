package _1Array_List;
import java.io.Serializable;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Object> l = new ArrayList<Object> ();
		l.add("A");
		l.add(10); 
		l.add("A");
		l.add(null);
		// l is ArrayList Object 
		// And i am trying to print reference 
// Whenever we are trying to print reference internally toString method is called
// In Every Collection toString is implemented using [ ]

		System.out.print(l);
		l.remove(2);
		System.out.print(l);
		l.add(2,"M");
		l.add("N");
		System.out.print(l);
		
		//Output 
//		[A, 10, A, null][A, 10, null][A, 10, M, null, N]
		
		
		ArrayList<Object> l1 = new ArrayList<Object>();
		System.out.print(l1 instanceof Serializable);
		System.out.print(l1 instanceof Cloneable);
		System.out.print(l1 instanceof RandomAccess);
		
		//Output	truetruetrue
		
		LinkedList<Object> l2 = new LinkedList<Object>();
		System.out.print(l2 instanceof Serializable);
		System.out.print(l2 instanceof Cloneable);
		System.out.print(l2 instanceof RandomAccess);
		
		//Output	truetruefalse
	}
}
