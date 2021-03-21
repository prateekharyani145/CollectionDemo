// Polymorphism	-Method Overloading
package CoreTopics;
class Manager{
}
class Buddy extends Manager{
}
class Trainee extends Buddy{
}
public class Test1 { 
	public void hexaview(Manager m) {
		System.out.println("Shweta Ma'am");
	}
	public void hexaview(Buddy b) {
		System.out.println("Lakshya Sir");
	}
	public void hexaview(Trainee t) {
		System.out.println("Prateek Haryani");
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		Manager m1 = new Manager();
		Buddy b1 = new Buddy();
		Trainee t1 = new Trainee();

		t.hexaview(b1);
		t.hexaview(m1);
		t.hexaview(t1);

		Manager m2 = new Buddy();
		Manager m3 = new Trainee();
		Buddy b2 = new Trainee();
//		Lakshya Sir
//		Shweta Ma'am
//		Prateek Haryani

		// Depends On Reference Type (Compile Time Polymorphism)
		t.hexaview(m2);
		t.hexaview(m3);
		t.hexaview(b2);
//		Shweta Ma'am
//		Shweta Ma'am
//		Lakshya Sir
	}
}
// In Method Overloading , method resolution is based on 
// reference type and not on run time object


