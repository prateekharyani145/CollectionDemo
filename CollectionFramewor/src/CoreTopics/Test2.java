// Polymorphism	-Method Overriding
package CoreTopics;
class HexaviewPrevious{
	public void manager(){
		System.out.println("Shweta Ma'am");
	}
	public void buddy(){
		System.out.println("Lakshya Sir");
	}
	public void trainee(){
		System.out.println("Prateek");
	}
}
class HexaviewCurrent extends HexaviewPrevious{
	public void manager(){
		System.out.println("Shweta Sanger Ma'am");
	}
	public void buddy(){
		System.out.println("Lakshya Saluja Sir");
	}
	public void trainee(){
		System.out.println("Prateek Haryani");
	}
}
public class Test2 { 
	public static void main(String[] args) {
		HexaviewPrevious hp1 = new HexaviewPrevious();
		HexaviewPrevious hp2 = new HexaviewCurrent();

		hp1.buddy();
		hp1.manager();
		hp1.trainee();
//		Lakshya Sir
//		Shweta Ma'am
//		Prateek

		// Depends on constructor (Rum Time Polymorphism) 
		hp2.buddy();
		hp2.manager();
		hp2.trainee();
//		Lakshya Saluja Sir
//		Shweta Sanger Ma'am
//		Prateek Haryani
	}
}
// In Method Overloading , method resolution is based on 
// reference type and not on run time object


